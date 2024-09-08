package sareen.shagun.Threads.Locks.Zero;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        ExecutorService es = Executors.newCachedThreadPool();

        Adder adder = new Adder(count);
        Subtracter subtracter = new Subtracter(count);

        es.submit(adder);
        es.submit(subtracter);

        System.out.println(count.value);
        es.shutdown();
        es.awaitTermination(100L, TimeUnit.MILLISECONDS);

    }
}
