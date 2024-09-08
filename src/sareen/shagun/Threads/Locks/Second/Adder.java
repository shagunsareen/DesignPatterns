package sareen.shagun.Threads.Locks.Second;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            synchronized (count){ //this basically means count.lock(); and count.unlock() in line 19. So it is equivalent to using lock function but not on lock object but on java's object i.e. count as every java object has implicit lock internally
                this.count.value += i;
                System.out.println("Added : " +count.value);
            }
        }
    }
}
