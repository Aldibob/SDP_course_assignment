package Bridge_pattern;
// Refined abstraction 1: Triangle

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("Creating triangle");
        color.fillColor();
    }
}
