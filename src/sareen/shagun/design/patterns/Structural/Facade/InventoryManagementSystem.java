package sareen.shagun.design.patterns.Structural.Facade;

public class InventoryManagementSystem implements OrderPlacedSubscriber {

    InventoryManagementSystem(OrderPlacedFacade orderPlacedFacade){
        orderPlacedFacade.addOrderPlacedSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        update(order.getProductId());
    }

    public void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory.");
    }
}
