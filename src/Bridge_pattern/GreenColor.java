package Bridge_pattern;
// Concrete Implementation 1: Green color

public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.print(" and");
        System.out.println(" filling with green color.");
    }
}
