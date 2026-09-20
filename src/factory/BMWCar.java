package factory;
// concrete product for BMW cars
public class BMWCar extends Car {
    @Override
    public void startCar() {
        System.out.println("Starting BMW car");
    }
}
