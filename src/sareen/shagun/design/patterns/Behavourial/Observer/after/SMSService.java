package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class SMSService implements OrderPlacedSubscriber {

    SMSService(Flipkart flipkart) {
        flipkart.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendSMS(order.customerPhone, "Your order is placed successfully");
    }

    public void sendSMS(String to, String text){
        System.out.println("Sending SMS to : "+ to + " with text : "+ text);
    }
}
