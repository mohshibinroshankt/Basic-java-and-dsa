import java.util.Scanner;

public class if_else_demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);

        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
