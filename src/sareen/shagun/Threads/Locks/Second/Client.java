package sareen.shagun.Threads.Locks.Second;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//This is implicit lock method
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        count.value = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(adder);
        executorService.submit(subtractor);

        executorService.shutdown();

        executorService.awaitTermination(100, TimeUnit.MINUTES);
        System.out.println(count.value);
    }
}
