package facade;

public class Amplifier {

    public void On() {
        System.out.println("Amplifier on");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume of the Theater to " + volume);
    }

    public void Off() {
        System.out.println("Amplifier off");
    }
}
