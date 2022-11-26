package abenamor.io.design.patterns.factory.method.pattern.products.chicago;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago style Pepperonie pizza";
        this.dough = " Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Mozzarella Parmesan, black olives");
    }
}
