package abenamor.io.design.patterns.adapter;

import abenamor.io.design.patterns.adapter.adaptee.Turkey;
import abenamor.io.design.patterns.adapter.adaptee.WildTurkey;
import abenamor.io.design.patterns.adapter.client.Duck;
import abenamor.io.design.patterns.adapter.client.MallardDuck;
import abenamor.io.design.patterns.adapter.client.TurkeyAdapter;

/**
 * This class is used to test the Adapter class TurkeyAdapter
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says ...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says ...");
        testDuck(mallardDuck);

        System.out.println("The turkey adapter says ...");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck mallardDuck) {
        mallardDuck.quack();
        mallardDuck.fly();
    }
}
