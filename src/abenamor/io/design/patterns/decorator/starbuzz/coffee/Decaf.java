package abenamor.io.design.patterns.decorator.starbuzz.coffee;

/**
 * This class represents the concrete component at the Decorator class diagram
 */
public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
