class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SyncDemo extends Thread {
    Counter counter;

    SyncDemo(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Counter counter = new Counter();
        SyncDemo t1 = new SyncDemo(counter);
        SyncDemo t2 = new SyncDemo(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
