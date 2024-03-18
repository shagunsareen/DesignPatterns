package sareen.shagun.design.patterns.Behavourial.Strategy.after;

import sareen.shagun.design.patterns.Behavourial.Strategy.after.pathCalculatorStrategy.PathCalculationStrategy;
import sareen.shagun.design.patterns.Behavourial.Strategy.after.pathCalculatorStrategy.PathCalculatorStrategyFactory;
import sareen.shagun.design.patterns.Behavourial.Strategy.before.Mode;

public class GoogleMaps {
    public void finaPath(String from, String to, Mode mode) {
        PathCalculationStrategy pathCalculationStrategy =
                PathCalculatorStrategyFactory.getStrategy(mode);
        pathCalculationStrategy.findPath(from, to);
    }
}
