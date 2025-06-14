class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Runnable_demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
