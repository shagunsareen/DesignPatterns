package sareen.shagun.design.patterns.Structural.Adapter.thirdParty;

public class RazorPayApi {
    public String makeLink() {
        return "RazorPay";
    }

    public void prePay() {
        System.out.println("RazorPay Payment");
    }

    public void pay(String name, int amount) {
        System.out.println("RazorPay Payment" + name);
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.PASS;
    }
}
