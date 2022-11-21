package abenamor.io.design.patterns.decorator.starbuzz.coffee.condimnents;

import abenamor.io.design.patterns.decorator.starbuzz.coffee.Beverage;
import abenamor.io.design.patterns.decorator.starbuzz.coffee.CondimentDecorator;

/**
 * This class represents a concrete decorator at the decorator class diagram
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
