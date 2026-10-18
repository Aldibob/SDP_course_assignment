package facade;

public class Main {
    static void main() {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Hulk");

        System.out.println();

        homeTheater.endMovie("Hulk");
    }
}
