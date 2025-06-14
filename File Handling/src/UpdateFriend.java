import java.io.FileWriter;
import java.io.IOException;

public class UpdateFriend {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\ktros\\Documents\\Friends.txt");
            myWriter.write("Add some names from your friend list");
            myWriter.close();
            System.out.println("Successfully added some names from your friend list");

        } catch (IOException e) {
            System.out.println("Error while writing to file");
            e.printStackTrace();

        }
    }
}
