package sareen.shagun.design.patterns.Structural.Decorator;

public class Client {
    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getCost() + " - "+ pizza.getDescription());

        Pizza pizza1 = new FarmhousePizza();

        pizza1 = new CapsicumDecorator(pizza1);

        System.out.println(pizza1.getCost() + pizza1.getDescription());

        pizza1 = new PaneerDecorator((pizza1));

        System.out.println(pizza1.getCost() + pizza1.getDescription());


    }
}
