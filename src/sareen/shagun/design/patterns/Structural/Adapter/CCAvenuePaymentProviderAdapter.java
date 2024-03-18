package sareen.shagun.design.patterns.Structural.Adapter;

import sareen.shagun.design.patterns.Structural.Adapter.thirdParty.CCAvenuePayApi;
import sareen.shagun.design.patterns.Structural.Adapter.thirdParty.CCAvenuePayStatus;

import java.util.Arrays;

public class CCAvenuePaymentProviderAdapter implements PaymentProviderInterface{

    private CCAvenuePayApi ccAvenuePayApi = new CCAvenuePayApi();

    @Override
    public String generateLink() {
        return ccAvenuePayApi.createURL();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        ccAvenuePayApi.doPayment(paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CCAvenuePayStatus status = ccAvenuePayApi.verifyStatus();
        if(status == CCAvenuePayStatus.OK){
            return PaymentStatus.SUCCESS;
        }else{
            return PaymentStatus.FAILURE;
        }
    }
}
