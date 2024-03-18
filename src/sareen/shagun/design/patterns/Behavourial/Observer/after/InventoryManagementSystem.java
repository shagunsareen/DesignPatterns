package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class InventoryManagementSystem implements OrderPlacedSubscriber{

    InventoryManagementSystem(Flipkart flipkart){
        flipkart.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        update(order.getProductId());
    }

    public void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory.");
    }
}
