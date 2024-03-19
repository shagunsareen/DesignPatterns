package sareen.shagun.design.patterns.Structural.Decorator;

public class FarmhousePizza implements Pizza{
    @Override
    public String getDescription() {
        return " Farmhouse Pizza ";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
