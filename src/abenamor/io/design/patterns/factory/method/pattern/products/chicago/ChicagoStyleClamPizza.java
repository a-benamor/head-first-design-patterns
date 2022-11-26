package abenamor.io.design.patterns.factory.method.pattern.products.chicago;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        this.name = "Chicago style Clam pizza";
        this.dough = " Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Mozzarella Parmesan");
    }
}
