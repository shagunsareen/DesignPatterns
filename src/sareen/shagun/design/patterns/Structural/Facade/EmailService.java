package sareen.shagun.design.patterns.Structural.Facade;

public class EmailService implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    EmailService(OrderPlacedFacade orderPlacedFacade, OrderCancelledFacade orderCancelledFacade)
    {
        orderPlacedFacade.addOrderPlacedSubscriber(this);
        orderCancelledFacade.addOrderCancelledSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendEmail(order.getCustomerEmail(), "Your order is placed successfully.");
    }

    public void sendEmail(String to, String body){
        System.out.println("Sending email to : "+ to + " with body : "+ body);
    }

    @Override
    public void onOrderCancelled(Order order) {
        sendEmail(order.getCustomerEmail(), "Your order is cancelled successfully.");
    }
}
