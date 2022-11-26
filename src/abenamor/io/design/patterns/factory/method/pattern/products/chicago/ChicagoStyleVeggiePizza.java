package abenamor.io.design.patterns.factory.method.pattern.products.chicago;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago style Veggie pizza";
        this.dough = " Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Mozzarella Parmesan");
    }
}
