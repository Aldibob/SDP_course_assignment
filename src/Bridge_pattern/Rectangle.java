package Bridge_pattern;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("Rectangle");
        color.fillColor();
    }
}
