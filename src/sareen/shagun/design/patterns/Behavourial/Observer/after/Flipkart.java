package sareen.shagun.design.patterns.Behavourial.Observer.after;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public void addOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(Order order){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.onOrderPlaced(order);
        }
    }
}
