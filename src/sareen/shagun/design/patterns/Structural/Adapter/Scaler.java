package sareen.shagun.design.patterns.Structural.Adapter;

import java.util.List;

public class Scaler {

    List<PaymentProviderInterface> paymentProviders = List.of(new RazorPayPaymentProviderAdapter());

    Scaler(List<PaymentProviderInterface> paymentProviders) {
        this.paymentProviders = paymentProviders;
    }

    String admitStudent() {
        return paymentProviders.get(0).generateLink();
    }
}
