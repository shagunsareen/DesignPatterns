package sareen.shagun.design.patterns.Structural.Decorator;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return " Margherita Pizza ";
    }

    @Override
    public int getCost() {
        return 250;
    }
}
