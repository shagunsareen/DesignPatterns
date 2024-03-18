package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator(Flipkart flipkart) {
        flipkart.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.getOrderId());
    }

    public void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for : " + orderId);
    }
}
