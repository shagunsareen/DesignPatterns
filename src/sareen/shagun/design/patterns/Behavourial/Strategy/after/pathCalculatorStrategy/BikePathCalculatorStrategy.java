package sareen.shagun.design.patterns.Behavourial.Strategy.after.pathCalculatorStrategy;

public class BikePathCalculatorStrategy implements PathCalculationStrategy {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path for bike");
    }
}
