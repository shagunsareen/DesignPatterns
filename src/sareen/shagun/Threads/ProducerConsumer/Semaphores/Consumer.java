package sareen.shagun.Threads.ProducerConsumer.Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            /*synchronized (store) {
                if (store.getItems().size() > 0) {
             */
            try {
                consumerSemaphore.acquire(); //now consumer will consume the item from the store
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem(); //consumer will consume the item hence we need to decrement the item from the store
            producerSemaphore.release(); //this will let the producer know that there is 1 vacancy now for which he can produce the item
        }
    }
}

