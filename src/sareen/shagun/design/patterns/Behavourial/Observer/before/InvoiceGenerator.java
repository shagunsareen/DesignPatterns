package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class InvoiceGenerator {
    public void generateInvoice(Long orderId){
        System.out.println("Generating invoice for : "+orderId);
    }
}
