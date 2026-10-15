package facade;

public class DvdPlayer {
    public void On() {
        System.out.println("DVD-Player On");
    }

    public void playMovie(String movie) {
        System.out.println("DVD-Player playing " + movie);
    }

    public void stopMovie(String movie) {
        System.out.println("DVD-Player stopped movie " + movie);
    }

    public void off() {
        System.out.println("DVD-Player off");
    }
}
