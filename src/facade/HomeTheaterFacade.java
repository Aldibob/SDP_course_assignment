package facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Lights lights;
    Screen screen;
    Projector projector;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Lights lights, Screen screen, Projector projector, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        popcornPopper.On();
        popcornPopper.Pop();
        lights.On();
        lights.setBrightness(10);
        screen.On();
        projector.On();
        amplifier.On();
        amplifier.setVolume(5);
        dvdPlayer.On();
        dvdPlayer.playMovie(movie);
    }
}
