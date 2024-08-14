import java.util.Random;

class MyClass extends Thread {
    private static final int MIN_PRIORITY = 1;
    private static final int MAX_PRIORITY = 5;
    private int counter = 0;

    public MyClass(String name) {
        super(name);
        int randomPriority = MIN_PRIORITY + new Random().nextInt(MAX_PRIORITY - MIN_PRIORITY + 1);
        setPriority(randomPriority);
    }

    public void run() {
        while (counter < 100) {// counter can be changed
            int currentPriority = getPriority();
            System.out.println(getName() + ": Priority = " + currentPriority + ", Counter = " + counter);

            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (counter % 30 == 0) {
                currentPriority += (getName().hashCode() % 2 == 0) ? 1 : 2;
                if (currentPriority > MAX_PRIORITY) {
                    currentPriority = MAX_PRIORITY;
                }
                setPriority(currentPriority);
            }

            counter++;
        }
    }
}

public class D8p2 {
    public static void main(String[] args) {
        MyClass[] threads = new MyClass[4];

        for (int i = 0; i < 4; i++) {
            threads[i] = new MyClass("Thread-" + i);
            threads[i].start();
        }
    }
}
