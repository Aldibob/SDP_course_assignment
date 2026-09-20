package factory;
// factory for BMW vehicles

public class BMWFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new BMWMotorcycle();
    }
}
