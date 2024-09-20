package sareen.shagun.Threads.ProducerConsumer.Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


//This method will allow only one thread to work on the store at once i.e. either producer or consumer and that is not at all beneficial.
public class Main {
    public static void main(String[] args) {
        try {
            ExecutorService es = Executors.newCachedThreadPool();
            Store store = new Store(5);

            //we will create semaphores for producer and consumer both so that we can tell which one should go first as consumer should not go first if there is nothing in the store
            Semaphore producerSemaphore = new Semaphore(5);
            Semaphore consumerSemaphore = new Semaphore(0);

            for (int i = 1; i <= 8; i++) {
                es.execute(new Producer(store, producerSemaphore, consumerSemaphore));  //we are producing 8 producers but due to synchronisation it will check for the store maxsize and then allow to produce
            }

            for (int i = 1; i <= 20; i++) {
                es.execute(new Consumer(store, producerSemaphore, consumerSemaphore)); //we are allowing 20 consumers but due to synchronisation it will check if there is anything in the store then it will allow to consume else no
            }
        } catch (Exception e) {
            System.out.println("WAIT");
        }
    }
}
