package sareen.shagun.design.patterns.Structural.Decorator;

public abstract class ToppingsDecorator implements Pizza {

    //object we will decorate
    Pizza pizza;

    public ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
