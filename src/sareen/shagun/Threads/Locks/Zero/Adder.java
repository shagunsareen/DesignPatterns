package sareen.shagun.Threads.Locks.Zero;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //synchronized (this) {
                this.count.value += i;
            //}
        }
    }
}
