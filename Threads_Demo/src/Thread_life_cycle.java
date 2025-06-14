class newThread extends Thread {
    public void run() {
        System.out.println(getName() + " - state: RUNNABLE");
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " - state: Running step " + i);

            if (i == 2) {
                System.out.println(getName() + " yielding");
                Thread.yield();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
        System.out.println(getName() + " - state: FINISHED");
    }
}

public class Thread_life_cycle {
    public static void main(String[] args) {
        newThread t1 = new newThread();
        newThread t2 = new newThread();

        t1.start();
        t2.start();
    }
}
