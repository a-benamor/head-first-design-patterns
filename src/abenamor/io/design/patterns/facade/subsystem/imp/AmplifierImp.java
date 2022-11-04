package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.Amplifier;

public class AmplifierImp implements Amplifier {
    @Override
    public void on() {
        System.out.println("Amplifier is on ");
    }

    @Override
    public void setVolume(Integer volume) {
        System.out.println("Amplifier volume is set to " + volume);
    }
}
