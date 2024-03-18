package sareen.shagun.design.patterns.Structural.Adapter;

import sareen.shagun.design.patterns.Structural.Adapter.thirdParty.RazorPayApi;
import sareen.shagun.design.patterns.Structural.Adapter.thirdParty.RazorPayStatus;

public class RazorPayPaymentProviderAdapter implements PaymentProviderInterface{

    private RazorPayApi razorPayApi = new RazorPayApi();

    @Override
    public String generateLink() {
        return razorPayApi.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        razorPayApi.prePay();
        razorPayApi.pay(paymentRequest.getName(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status  = razorPayApi.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {
        if(status ==  RazorPayStatus.PASS){
            return PaymentStatus.SUCCESS;
        }else{
            return PaymentStatus.FAILURE;
        }
    }
}
