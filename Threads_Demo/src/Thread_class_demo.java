class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("My thread running " + i);
        }
    }
}
public class Thread_class_demo {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}