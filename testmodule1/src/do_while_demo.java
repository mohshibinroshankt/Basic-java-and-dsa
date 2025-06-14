import java.util.Scanner;

public class do_while_demo {
    public static void main(String[] args) {
        int unreadEmails;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of unread emails: ");
        unreadEmails = in.nextInt();

        do{
            System.out.print("Check email before log off..: ");
            if(unreadEmails>0){
                System.out.print("you have "+unreadEmails+" unread emails: ");
                unreadEmails--;
            }else {
                System.out.print("No unread emails: ");
            }
        }while(unreadEmails>0);
    }
}
