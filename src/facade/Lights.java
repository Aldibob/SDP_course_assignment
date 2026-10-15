package facade;

public class Lights {
    int brightness;

    public Lights(int brightness) {
        this.brightness = brightness;
    }

    public void LightsOn() {
        System.out.println("Lights: on");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness of the lights: " + this.brightness);
    }
}
