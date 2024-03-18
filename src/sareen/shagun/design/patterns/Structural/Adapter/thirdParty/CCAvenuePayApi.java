package sareen.shagun.design.patterns.Structural.Adapter.thirdParty;

public class CCAvenuePayApi {

    public String createURL() {
        return "CCAvenue";
    }

    public void doPayment(int amount) {
        System.out.println("CCAvenue Payment " + amount);
    }

    public CCAvenuePayStatus verifyStatus() {
        return CCAvenuePayStatus.OK;
    }
}
