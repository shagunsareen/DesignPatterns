package sareen.shagun.Threads.Locks.Second;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            synchronized (this) {
                this.count.value -= i;
                System.out.println("Subtracted : " + count.value);
            }
        }
    }
}
