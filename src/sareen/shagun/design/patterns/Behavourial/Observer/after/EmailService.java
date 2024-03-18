package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class EmailService implements OrderPlacedSubscriber{

    EmailService(Flipkart flipkart)
    {
        flipkart.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendEmail(order.getCustomerEmail(), "Your order is placed successfully.");
    }

    public void sendEmail(String to, String body){
        System.out.println("Sending email to : "+ to + " with body : "+ body);
    }
}
