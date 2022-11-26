package abenamor.io.design.patterns.factory.method.pattern;

import abenamor.io.design.patterns.factory.method.pattern.creators.ChicagoPizzaStore;
import abenamor.io.design.patterns.factory.method.pattern.creators.NyPizzaStore;
import abenamor.io.design.patterns.factory.method.pattern.creators.PizzaStore;
import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered " + nyPizza.getName());

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered " + chicagoPizza.getName());
    }
}
