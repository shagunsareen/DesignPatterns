package sareen.shagun.design.patterns.Structural.Adapter;

public interface PaymentProviderInterface {
    public String generateLink();

    public void pay(PaymentRequest paymentRequest);

    public PaymentStatus checkStatus();
}
