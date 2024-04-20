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
            synchronized (count){
                this.count.value += i;
                System.out.println("Added : " +count.value);
            }
        }
    }
}
