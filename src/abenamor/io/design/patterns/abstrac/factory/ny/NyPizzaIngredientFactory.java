package abenamor.io.design.patterns.abstrac.factory.ny;

import abenamor.io.design.patterns.abstrac.factory.*;
import abenamor.io.design.patterns.abstrac.factory.ny.ingredients.FreshClam;
import abenamor.io.design.patterns.abstrac.factory.ny.ingredients.MarinaraSauce;
import abenamor.io.design.patterns.abstrac.factory.ny.ingredients.ReggianoCheese;
import abenamor.io.design.patterns.abstrac.factory.ny.ingredients.ThinCrustDough;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
