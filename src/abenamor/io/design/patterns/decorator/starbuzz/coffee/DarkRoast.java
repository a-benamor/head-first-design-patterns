package abenamor.io.design.patterns.decorator.starbuzz.coffee;

/**
 * This class represents the concrete component at the Decorator class diagram
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
