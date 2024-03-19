package sareen.shagun.design.patterns.Structural.Decorator;

public class PaneerDecorator extends ToppingsDecorator{

    PaneerDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Toppings : Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 55;
    }
}
