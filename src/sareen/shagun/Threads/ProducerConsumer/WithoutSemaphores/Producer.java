package sareen.shagun.Threads.ProducerConsumer.WithoutSemaphores;

public class Producer implements Runnable{

    //producer is also working on the store object
    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.getItems().size() < store.getMaxSize()){
                    store.addItem();
                }
            }
        }
    }
}
