package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.DvdPlayer;

public class DvdPlayerPlayerImp implements DvdPlayer {
    @Override
    public void on() {
        System.out.println("Dvd player is on ");
    }
}
