package visitor;

public class AreaCalculatorVisitor implements ShapeVisitor {
    private static final double PI = Math.PI;
    private double totalArea;
    private double area;

    @Override
    public void visitCircle(Circle circle) {
        area = PI * circle.getRadius() * circle.getRadius();
        totalArea += area;
        System.out.println("Area of the Circle: " + area);
    }

    @Override
    public void visitSquare(Square square) {
        area = square.getSide() * square.getSide();
        totalArea += area;
        System.out.println("Area of the Square: " + area);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        area = (0.5) * triangle.getBase() * triangle.getHeight();
        totalArea += area;
        System.out.println("Area of the Triangle: " + area);
    }

    public double getTotalArea() {
        return totalArea;
    }
}
