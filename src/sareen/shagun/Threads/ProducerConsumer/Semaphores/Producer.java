package sareen.shagun.Threads.ProducerConsumer.Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    //producer is also working on the store object
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            /*synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            }*/
            try {
                producerSemaphore.acquire(); //take the lock on store by producer and add the item i.e. produce something
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consumerSemaphore.release();
        }
    }
}
