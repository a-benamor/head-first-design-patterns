package abenamor.io.design.patterns.facade.client;

import abenamor.io.design.patterns.facade.subsystem.*;

/**
 * This class represents the Facade interface for all classes of the complex subsystem.
 * It's intent to make the subsystem easy to use
 */
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private TheaterLight theaterLight;
    private Popper popper;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, TheaterLight theaterLight, Popper popper, Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLight = theaterLight;
        this.popper = popper;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie ...");
        popper.on();
        popper.pop();
        theaterLight.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        System.out.println("Get ready to watch a movie ...");
    }
}
