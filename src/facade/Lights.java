package facade;

public class Lights {

    public void On() {
        System.out.println("Theater lights on");
    }

    public void dim(int brightness) {
        System.out.println("Setting brightness of the dimming lights to " + brightness + "%");
    }

    public void Off() {
        System.out.println("Theater lights off");
    }
}
