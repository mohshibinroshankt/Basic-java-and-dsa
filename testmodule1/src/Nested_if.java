import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String department;
        int yrsOfExperience;

        System.out.print("Enter the department : ");
        department = sc.nextLine();
        System.out.print("Enter the years of experience : ");
        yrsOfExperience = sc.nextInt();

        if(department.equals("IT")) {
            if(yrsOfExperience>= 3) {
                System.out.println("Access Granted for Internal IT System");

            }else {
                System.out.println("Access Denied :At least 3 years experience required");
            }
        }else {
            System.out.println("Access Denied: Only for Internal IT department employees");
        }

    }
}
