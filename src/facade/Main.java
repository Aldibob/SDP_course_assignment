package facade;

public class Main {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Hulk");

        System.out.println();

        homeTheater.endMovie("Hulk");
    }
}
