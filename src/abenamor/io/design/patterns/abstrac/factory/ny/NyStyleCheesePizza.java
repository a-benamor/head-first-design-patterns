package abenamor.io.design.patterns.abstrac.factory.ny;

import abenamor.io.design.patterns.abstrac.factory.Pizza;
import abenamor.io.design.patterns.abstrac.factory.PizzaIngredientFactory;

public class NyStyleCheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public NyStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
