package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class Client {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

        Flipkart flipkart = new Flipkart(emailService, smsService, invoiceGenerator, inventoryManagementSystem);

        flipkart.orderPlaced(new Order(1L, "shagunsareen@gmail.com", 5L, "9599995478"));
    }
}
