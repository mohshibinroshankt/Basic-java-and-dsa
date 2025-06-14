import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int total_working_hours=8;
        int worked_hours;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of worked hours: ");
        worked_hours = input.nextInt();

        while(worked_hours<total_working_hours){
            System.out.println("Hour" + (worked_hours+1) +" :Keep working...");
            worked_hours++;

        }
        System.out.println("work day completed, you can logout now");
    }
}
