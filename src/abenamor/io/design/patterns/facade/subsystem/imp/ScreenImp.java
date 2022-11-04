package abenamor.io.design.patterns.facade.subsystem.imp;

import abenamor.io.design.patterns.facade.subsystem.Screen;

public class ScreenImp implements Screen {
    @Override
    public void down() {
        System.out.println("Screen is down ");
    }
}
