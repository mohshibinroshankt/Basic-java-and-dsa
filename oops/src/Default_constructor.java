// Class to represent a Person
class Person {
    String name;
    int age;
    float height;
    double weight;

    // Method to display person's details
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

// Main class
public class Default_constructor {
    public static void main(String[] args) {
        Person p = new Person();  // Using default constructor

        // First display (before setting values)
        p.show();

        // Setting values directly using object reference
        p.name = "John";
        p.age = 10;
        p.height = 20;
        p.weight = 30;

        // Second display (after setting values)
        p.show();
    }
}

