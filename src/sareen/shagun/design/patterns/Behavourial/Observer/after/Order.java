package sareen.shagun.design.patterns.Behavourial.Observer.after;

public class Order {
    String customerEmail;
    String customerPhone;
    Long productId;
    Long orderId;

    public Order(String customerEmail, String customerPhone, Long productId, Long orderId) {
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.productId = productId;
        this.orderId = orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

}
