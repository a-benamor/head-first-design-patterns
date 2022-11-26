package abenamor.io.design.patterns.factory.method.pattern.creators;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;
import abenamor.io.design.patterns.factory.method.pattern.products.chicago.ChicagoStyleCheesePizza;
import abenamor.io.design.patterns.factory.method.pattern.products.chicago.ChicagoStyleClamPizza;
import abenamor.io.design.patterns.factory.method.pattern.products.chicago.ChicagoStylePepperoniPizza;
import abenamor.io.design.patterns.factory.method.pattern.products.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
