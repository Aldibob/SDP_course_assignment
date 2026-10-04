package Bridge_pattern;
// Concrete Implementation 2: Red color

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.print(" and");
        System.out.println(" filling with red color.");
    }
}
