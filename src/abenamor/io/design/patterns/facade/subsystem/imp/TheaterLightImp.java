package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.TheaterLight;

public class TheaterLightImp implements TheaterLight {
    @Override
    public void on() {
        System.out.println("Theater Light is on ");
    }

    @Override
    public void dim(Integer dim) {
        System.out.println("Dim set to " + dim);
    }
}
