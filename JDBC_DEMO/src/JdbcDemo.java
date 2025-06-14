import java.sql.*;

public class JdbcDemo {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "msrmysql19";

    public static void main(String[] args) {
        System.out.println("Attempting to connect to database...");

        try (Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
            System.out.println("Connected to database successfully");

            System.out.println("\n--- Inserting a new user ---");
            String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
            try(PreparedStatement pstmt = conn.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)){
                pstmt.setString(1, "Charlie Brown"); // Set value for the first ?
                pstmt.setString(2, "charlie@example.com"); // Set value for the second ?

                int rowsAffected = pstmt.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted.");

                // Retrieve the auto-generated ID
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        long id = generatedKeys.getLong(1);
                        System.out.println("Inserted user with ID: " + id);
                    }
                }
            } catch (SQLException e) {
                // Handle potential duplicate entry errors or other SQL issues
                if (e.getSQLState().startsWith("23")) { // SQLState 23xxx indicates integrity constraint violation (like duplicate email)
                    System.err.println("Error inserting user: Duplicate email address or other integrity violation.");
                } else {
                    System.err.println("Error during insert operation: " + e.getMessage());
                    e.printStackTrace(); // Print stack trace for detailed debugging
                }
            }

            // --- 2. Selecting Data ---
            System.out.println("\n--- Reading all users ---");
            String selectSql = "SELECT id, name, email, created_at FROM users"; // Select specific columns
            try (Statement stmt = conn.createStatement(); // Simple Statement is fine for static query
                 ResultSet rs = stmt.executeQuery(selectSql)) { // Execute the SELECT query

                // Iterate through the result set
                while (rs.next()) {
                    // Retrieve data by column name or index
                    int id = rs.getInt("id"); // Or rs.getInt(1);
                    String name = rs.getString("name"); // Or rs.getString(2);
                    String email = rs.getString("email"); // Or rs.getString(3);
                    Timestamp createdAt = rs.getTimestamp("created_at"); // Or rs.getTimestamp(4);

                    // Print the retrieved data
                    System.out.printf("ID: %d, Name: %s, Email: %s, Created At: %s%n",
                            id, name, email, createdAt);
                }
            } catch (SQLException e) {
                System.err.println("Error reading all users: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.println("\n--- Updating a user's name ---");
            String updateSql = "UPDATE users SET name = ? WHERE email = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSql)){

                pstmt.setString(1,"Charlie B.");
                pstmt.setString(2,"Charlie@example.com");


                int rowsAffected = pstmt.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated.");
            } catch (SQLException e) {
                System.err.println("Error updating user: " + e.getMessage());
                e.printStackTrace();
            }


            System.out.println("\n--- Reading user after update ---");
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSql)){
                while (rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email =rs.getString("email");
                    Timestamp createdAt = rs.getTimestamp("created_at");
                    System.out.printf("ID: %d, Name: %s, Email: %s, Created At: %s%n", id, name, email, createdAt);
                }
            } catch (SQLException e) {
                System.err.println("Error reading user: " + e.getMessage());
                e.printStackTrace();
            }

            // --- Optional: Deleting a user ---
            System.out.println("\n--- Deleting a user ---");
            String deleteSql = "DELETE FROM users WHERE email = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) { // Use PreparedStatement
                pstmt.setString(1, "charlie@example.com"); // Email to identify the user

                int rowsAffected = pstmt.executeUpdate(); // Execute the DELETE statement
                System.out.println(rowsAffected + " row(s) deleted.");
            } catch (SQLException e) {
                System.err.println("Error deleting user: " + e.getMessage());
                e.printStackTrace();

            }


        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n Demo completed");
    }
}
