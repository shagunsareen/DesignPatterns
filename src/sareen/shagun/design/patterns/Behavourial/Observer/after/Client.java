package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class Client {
    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        //this will automatically add the subscribers to the subscriber list
        EmailService emailService = new EmailService(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);

        flipkart.orderPlaced(new Order("shagunsareen@gmail.com", "953062282",
                5L, 1L));
    }
}
