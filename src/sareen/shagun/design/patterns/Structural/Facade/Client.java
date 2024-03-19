package sareen.shagun.design.patterns.Structural.Facade;

public class Client {
    public static void main(String[] args) {

        OrderPlacedFacade orderPlacedFacade = new OrderPlacedFacade();
        OrderCancelledFacade orderCancelledFacade = new OrderCancelledFacade();

        Flipkart flipkart = new Flipkart(orderPlacedFacade, orderCancelledFacade);

        //this will automatically add the subscribers to the subscriber list
        EmailService emailService = new EmailService(orderPlacedFacade, orderCancelledFacade);
        SMSService smsService = new SMSService(orderPlacedFacade, orderCancelledFacade);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(orderPlacedFacade);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(orderPlacedFacade);

        Order order = new Order("shagunsareen@gmail.com", "953062282",
                5L, 1L);

        flipkart.orderPlaced(order);

        flipkart.orderCancelled(order);
    }
}
