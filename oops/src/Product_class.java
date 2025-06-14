import java.util.Scanner;

// Class representing a product
class Product {
    String name;
    double price;
    int quantity;

    // Method to get input from user
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the product: ");
        name = sc.nextLine();

        System.out.print("Enter the price of the product: ");
        price = sc.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        quantity = sc.nextInt();
    }

    // Method to calculate total amount
    double total_amt() {
        return quantity * price;
    }

    // Method to display product details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total_amt());
    }
}

// Main class with main method
public class Product_class {
    public static void main(String[] args) {
        Product p1 = new Product(); // Creating an object
        p1.getData();               // Getting user input
        p1.display();               // Displaying details
    }
}
