package abenamor.io.design.patterns.abstrac.factory.ny;

import abenamor.io.design.patterns.abstrac.factory.Pizza;
import abenamor.io.design.patterns.abstrac.factory.PizzaIngredientFactory;
import abenamor.io.design.patterns.abstrac.factory.PizzaStore;

/**
 * New York pizza store
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory nyPizzaIngredientFactory = new NyPizzaIngredientFactory();
        if (type.equals("cheese")){
            return new NyStyleCheesePizza(nyPizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            return new NyStyleVeggiePizza(nyPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            return new NyStyleClamPizza(nyPizzaIngredientFactory);
        } else if (type.equals("pepperoni")) {
            return new NyStylePepperoniPizza(nyPizzaIngredientFactory);
        }else {
            return null;
        }
    }
}
