import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        String leaveType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter leave type: ");
        leaveType = sc.nextLine();

        switch (leaveType) {
            case "sick":
            case "Sick":
                System.out.println("you can use upto 12 sick leaves");
                break;
            case "Casual":
            case "casual":
                System.out.println("you are allowed to take  12 casual leaves");
                break;
            case"Earned":
            case "earned":
                System.out.println("Earned leaves are credited monthly and can be carries over");

                break;
            default:
                System.out.println("Invalid leave type. Please check your policy");
        }
    }
}
