package facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Lights lights;
    private Screen screen;
    private Projector projector;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        screen = new Screen();
        lights = new Lights();
        popcornPopper = new PopcornPopper();
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        popcornPopper.On();
        popcornPopper.Pop();
        lights.Off();
        lights.dim(10);
        screen.On();
        projector.On();
        projector.fullScreen();
        amplifier.On();
        amplifier.setVolume(5);
        dvdPlayer.On();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie(String movie) {
        System.out.println("Shutting movie theater down...");
        popcornPopper.Off();
        lights.On();
        screen.Off();
        projector.Off();
        amplifier.Off();
        dvdPlayer.stopMovie(movie);
        dvdPlayer.off();


    }

}
