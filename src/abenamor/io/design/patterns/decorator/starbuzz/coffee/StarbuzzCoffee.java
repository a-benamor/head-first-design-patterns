package abenamor.io.design.patterns.decorator.starbuzz.coffee;

import abenamor.io.design.patterns.decorator.starbuzz.coffee.condimnents.Mocha;
import abenamor.io.design.patterns.decorator.starbuzz.coffee.condimnents.Soy;
import abenamor.io.design.patterns.decorator.starbuzz.coffee.condimnents.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+ "$" + espresso.cost());

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

    }
}
