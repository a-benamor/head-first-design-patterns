package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.Popper;

public class PopCorn implements Popper {
    @Override
    public void on() {
        System.out.println("PopCorn on logic ");
    }

    @Override
    public void pop() {
        System.out.println("Popcorn pop logic");
    }
}
