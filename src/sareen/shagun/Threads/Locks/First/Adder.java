package sareen.shagun.Threads.Locks.First;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {

        for(int i=0; i<100; i++){
            lock.lock();
            this.count.value += i;
            lock.unlock();
            System.out.println("Added : " +count.value);
        }
    }
}
