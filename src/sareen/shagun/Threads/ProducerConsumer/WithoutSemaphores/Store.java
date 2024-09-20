package sareen.shagun.Threads.ProducerConsumer.WithoutSemaphores;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Objects> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Objects> getItems() {
        return items;
    }

    public void setItems(List<Objects> items) {
        this.items = items;
    }

    public void addItem(){
        this.items.add(null);
        System.out.println("Item produced. New Count : "+ this.items.size());
    }

    public void removeItem(){
        this.items.remove(this.items.size()-1);
        System.out.println("Item consumed. New Count : "+ this.items.size());
    }
}
