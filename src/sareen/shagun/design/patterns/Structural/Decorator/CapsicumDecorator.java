package sareen.shagun.design.patterns.Structural.Decorator;

public class CapsicumDecorator extends ToppingsDecorator {

    CapsicumDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Toppings : Capsicum ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 35;
    }
}
