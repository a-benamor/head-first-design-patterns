package abenamor.io.design.patterns.decorator.starbuzz.coffee;

/**
 * This class represents the concrete component at the Decorator class diagram
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
