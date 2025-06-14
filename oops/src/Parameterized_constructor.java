class Emp {
    String name;
    int id;
    int salary;

    // Default constructor
    Emp() {
        System.out.println("default constructor called");
    }

    // Parameterized constructor
    Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display data
    void show() {
        System.out.println("id: " + id + " name: " + name + " salary: " + salary);
    }
}
public class Parameterized_constructor {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1, "John Doe", 20000); // Calls parameterized constructor
        Emp emp2 = new Emp(2, "David", 30000);    // Another object with different values

        emp1.show(); // prints John's details
        emp2.show(); // prints David's details
    }
}
