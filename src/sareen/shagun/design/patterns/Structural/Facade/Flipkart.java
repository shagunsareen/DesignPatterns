package sareen.shagun.design.patterns.Structural.Facade;

//-- As this class had too many responsibilities so better create a separate facade for this
public class Flipkart {
    OrderPlacedFacade opf ;
    OrderCancelledFacade ocf;

    public Flipkart(OrderPlacedFacade opf, OrderCancelledFacade ocf) {
        this.opf = opf;
        this.ocf = ocf;
    }

    public void orderPlaced(Order order) {
        opf.orderPlaced(order);
    }

    public void orderCancelled(Order order) {
        ocf.onOrderCancelled(order);
    }
}
