package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.Projector;

public class ProjectorImp implements Projector {
    @Override
    public void on() {
        System.out.println("Projector is on ");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("wide screen mode logic ");
    }
}
