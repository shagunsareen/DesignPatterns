package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class Flipkart {

    private EmailService emailService;
    private SMSService smsService;
    private InvoiceGenerator invoiceGenerator;
    private InventoryManagementSystem inventoryManagementSystem;

    public Flipkart(EmailService emailService, SMSService smsService,
                    InvoiceGenerator invoiceGenerator,
                    InventoryManagementSystem inventoryManagementSystem){
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceGenerator = invoiceGenerator;
        this.inventoryManagementSystem = inventoryManagementSystem;
    }

    public void orderPlaced(Order order){
        emailService.sendEmail(order.getCustomerEmail(), "Your order is placed");
        smsService.sendSMS(order.getPhoneNum(), "Your order is placed");
        invoiceGenerator.generateInvoice(order.getOrderId());
        inventoryManagementSystem.update(order.getProductId());
    }
}
