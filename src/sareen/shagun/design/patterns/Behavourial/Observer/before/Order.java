package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class Order {
    public Order(Long orderId, String customerEmail, Long productId, String phoneNum) {
        this.orderId = orderId;
        this.customerEmail = customerEmail;
        this.productId = productId;
        this.phoneNum = phoneNum;
    }

    private Long orderId;
    private String customerEmail;
    private Long productId;
    private String phoneNum;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
