package abenamor.io.design.patterns.factory.method.pattern.products.ny;

import abenamor.io.design.patterns.factory.method.pattern.products.Pizza;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        this.name = "NY Style sauce and cheese pizza";
        this.dough = "Thin and Crust dough";
        this.sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
