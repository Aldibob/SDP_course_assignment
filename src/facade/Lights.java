package facade;

public class Lights {

    public void On() {
        System.out.println("Theater lights on");
    }

    public void setBrightness(int brightness) {
        System.out.println("Setting brightness of the lights to " + brightness);
    }

    public void Off() {
        System.out.println("Theater lights off");
    }
}
