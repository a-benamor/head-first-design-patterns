package abenamor.io.design.patterns.decorator.starbuzz.coffee;

/**
 * This class represents the concrete component at the Decorator class diagram
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
