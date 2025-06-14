import java.util.Scanner;


public class Emp_array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Employees: ");
        n = sc.nextInt();

        int[] empnos = new int[n];

        System.out.println("Enter the number employees: ");
        for (int i = 0; i < n; i++) {
            empnos[i] = sc.nextInt();
        }
        System.out.println("Enter the employee numps: ");
        for (int e : empnos){
            System.out.println(e);
        }

    }

}
