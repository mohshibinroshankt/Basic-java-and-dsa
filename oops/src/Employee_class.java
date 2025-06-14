// Class definition: 'Employee' is a blueprint to create employee objects
class Employee {
    // Instance variables (data members)
    String name;
    int salary;
    String Department;

    // Constructor: called automatically when an object is created
    public Employee(String name, int salary, String Department) {
        // 'this' keyword refers to the current object's variables
        this.name = name;
        this.salary = salary;
        this.Department = Department;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + Department);
    }
}

// Main class to run the program
public class Employee_class {
    public static void main(String[] args) {
        // Creating an object 'emp1' of the Employee class using the constructor
        Employee emp1 = new Employee("James", 2500, "Gupta");

        // Calling the display() method to show employee details
        emp1.display();
    }
}
