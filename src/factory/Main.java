package factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bmwFactory = new BMWFactory(); //creating factory for bmw cars
        Car bmw5 =  bmwFactory.createCar(); // i instantiated bmw with interface
        Motorcycle bmwF450GS = bmwFactory.createMotorcycle();
        bmw5.startCar();
        bmwF450GS.startMotorCycle();

        VehicleFactory hondaFactory = new HondaFactory();
        Car honda_xr_v = hondaFactory.createCar();
        Motorcycle xr_125_l = hondaFactory.createMotorcycle();
        honda_xr_v.startCar();
        xr_125_l.startMotorCycle();
    }
}
