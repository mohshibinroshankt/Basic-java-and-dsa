import java.io.File;

public class DeleteFriend {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\ktros\\Documents\\Friends.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());

        } else{
            System.out.println("Failed to delete the file: " + myObj.getName());
        }
    }
}
