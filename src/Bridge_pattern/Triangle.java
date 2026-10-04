package Bridge_pattern;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("Triangle ");
        color.fillColor();
    }
}
