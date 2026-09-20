package factory;
// abstract factory for concrete factories
public abstract class VehicleFactory {
// common methods for all factories
    protected abstract Car createCar();
    protected abstract Motorcycle createMotorcycle();

}
