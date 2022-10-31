package abenamor.io.design.patterns.adapter.client;

import abenamor.io.design.patterns.adapter.adaptee.Turkey;

/**
 * This class is used to adapt the Turkey interface to the Duck interface.
 * It implements the Target interface (Duck) and hold a reference to the adaptee which is a class that implements
 * the Turkey interface.
 */
public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
