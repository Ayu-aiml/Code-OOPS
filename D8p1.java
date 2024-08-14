class MyThread implements Runnable {
    private int priority;
    public MyThread(){
        priority=0;
    }
    public MyThread(int priority) {
        this.priority = priority;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class D8p1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(Thread.MAX_PRIORITY), "Thread-MaxPriority");
        Thread thread2 = new Thread(new MyThread(Thread.MIN_PRIORITY), "Thread-MinPriority");
        Thread thread3 = new Thread(new MyThread(Thread.NORM_PRIORITY), "Thread-AveragePriority");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
