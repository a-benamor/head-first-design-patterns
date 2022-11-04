package abenamor.io.design.patterns.facade.client;

import abenamor.io.design.patterns.facade.subsystem.*;
import abenamor.io.design.patterns.facade.subsystem.imp.*;

/**
 * The client interacts only with the HomeTheaterFacade class.
 * but it has direct access to the subsystem functionalities.
 */
public class HomeTheaterClient {
    public static void main(String[] args) {
        Amplifier amplifier = new AmplifierImp();
        DvdPlayer dvdPlayer = new DvdPlayerPlayerImp();
        Projector projector = new ProjectorImp();
        TheaterLight theaterLight = new TheaterLightImp();
        Popper popper = new PopCorn();
        Screen screen = new ScreenImp();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, theaterLight, popper, screen);
        homeTheaterFacade.watchMovie("Movie name");
    }
}
