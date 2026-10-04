package Bridge_pattern;

public class Main {
    public static void main(String[] args) {
        Shape redTriangle = new Triangle(new RedColor());
        Shape greenTriangle = new Triangle(new GreenColor());
        Shape redRectangle = new Rectangle(new RedColor());
        Shape greenRectangle = new Rectangle(new GreenColor());
        redTriangle.create();
        greenTriangle.create();
        redRectangle.create();
        greenRectangle.create();
    }
}
