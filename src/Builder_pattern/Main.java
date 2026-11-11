package Builder_pattern;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector(); // created director
        Car car = director.makeDailyCar(new DailyCar());// Building Daily car

        Car sport_car = director.makeSportCar(new SportCar());

        System.out.print(car.getWheels());
        System.out.print(car.isHasGPS() + "\n");
        System.out.println(sport_car.getEngine());
        System.out.println(sport_car.getWheels());
    }
}