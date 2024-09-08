package sareen.shagun.Threads.Locks.Zero;

public class Subtracter implements Runnable {
    private Count count;

    Subtracter(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //synchronized (this){
                this.count.value = -i;
            //}
        }
    }
}
