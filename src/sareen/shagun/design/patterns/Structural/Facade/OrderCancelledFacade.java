package sareen.shagun.design.patterns.Structural.Facade;

import java.util.ArrayList;
import java.util.List;

public class OrderCancelledFacade {

    List<OrderCancelledSubscriber> orderCancelledSubscribers = new ArrayList<>();

    public void addOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void removeOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void onOrderCancelled(Order order) {
        for (OrderCancelledSubscriber orderCancelledSubscriber : orderCancelledSubscribers) {
            orderCancelledSubscriber.onOrderCancelled(order);
        }
    }
}
