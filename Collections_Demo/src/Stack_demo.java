import java.util.*;
public class Stack_demo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("Settings");
        stack.push("Profiles");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Now at: " + stack.peek());
    }
}
