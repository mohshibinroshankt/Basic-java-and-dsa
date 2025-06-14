import java.util.Scanner;

public class Nested_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int day=1;day<=5;day++) {
            System.out.print("Day "+day+": ");

            for(int task=1;task<=5;task++) {
                System.out.print("Task "+task+": In progress ");
            }
            System.out.println();
        }
    }
}
