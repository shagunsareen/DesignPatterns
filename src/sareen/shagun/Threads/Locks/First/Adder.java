package sareen.shagun.Threads.Locks.First;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Count count;
    private Lock lock; //this is mutual exclusion where same lock object should be used by all tasks which are using shared variable so that the single loclk
    //should know which task has the lock at present

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
