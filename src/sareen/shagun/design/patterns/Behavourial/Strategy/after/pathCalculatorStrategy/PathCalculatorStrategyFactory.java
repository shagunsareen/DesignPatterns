package sareen.shagun.design.patterns.Behavourial.Strategy.after.pathCalculatorStrategy;

import sareen.shagun.design.patterns.Behavourial.Strategy.after.pathCalculatorStrategy.*;
import sareen.shagun.design.patterns.Behavourial.Strategy.before.Mode;

public class PathCalculatorStrategyFactory {
    public static PathCalculationStrategy getStrategy(Mode mode) {
        switch(mode){
            case CAR:
                return new CarPathCalculatorStrategy();
            case WALK:
                return new WalkPathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculatorStrategy();
            case PUBLIC:
            default:
                return new PublicPathCalculatorStrategy();
        }
    }
}
