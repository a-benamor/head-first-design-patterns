package abenamor.io.design.patterns.factory.method.pattern.creators;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;
import abenamor.io.design.patterns.factory.method.pattern.products.ny.NyStyleCheesePizza;
import abenamor.io.design.patterns.factory.method.pattern.products.ny.NyStyleClamPizza;
import abenamor.io.design.patterns.factory.method.pattern.products.ny.NyStylePepperoniPizza;
import abenamor.io.design.patterns.factory.method.pattern.products.ny.NyStyleVeggiePizza;

/**
 * New York pizza store
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NyStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NyStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NyStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
