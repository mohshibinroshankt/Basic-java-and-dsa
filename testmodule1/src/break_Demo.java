public class break_Demo {
    public static void main(String[] args) {
        for(int task =1; task<=10; task++) {
            if (task ==3) {
                System.out.println("Task :" + task + " is skipped");
                continue;
            }
            if (task ==7) {
                System.out.println("Critical issue found at Task :" + task+ "stopped processing");
                break;
            }
        }
    }
}
