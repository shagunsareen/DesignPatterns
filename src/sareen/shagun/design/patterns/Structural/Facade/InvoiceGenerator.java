package sareen.shagun.design.patterns.Structural.Facade;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator(OrderPlacedFacade orderPlacedFacade) {
        orderPlacedFacade.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.getOrderId());
    }

    public void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for : " + orderId);
    }
}
