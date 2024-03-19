package sareen.shagun.design.patterns.Structural.Facade;

public class SMSService implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    SMSService(OrderPlacedFacade orderPlacedFacade, OrderCancelledFacade orderCancelledFacade) {
        orderPlacedFacade.addOrderPlacedSubscriber(this);
        orderCancelledFacade.addOrderCancelledSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendSMS(order.customerPhone, "Your order is placed successfully");
    }

    public void sendSMS(String to, String text){
        System.out.println("Sending SMS to : "+ to + " with text : "+ text);
    }

    @Override
    public void onOrderCancelled(Order order) {
        sendSMS(order.customerPhone, "Your order is cancelled successfully");
    }
}
