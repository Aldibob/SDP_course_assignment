package Bridge_pattern;
// Refined abstraction 2: Rectangle

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("Creating rectangle");
        color.fillColor();
    }
}
