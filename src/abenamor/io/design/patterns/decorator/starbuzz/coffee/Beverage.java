package abenamor.io.design.patterns.decorator.starbuzz.coffee;

/**
 * This class represents the component at the Decorator class diagram
 */
public abstract class Beverage {
    protected String description="Unknown beverage";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
