package visitor;

public class AreaCalculatorVisitor implements ShapeVisitor {
    private static final double PI = Math.PI;
    private double totalArea;

    @Override
    public void visitCircle(Circle circle) {
        totalArea += PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visitSquare(Square square) {
        totalArea += square.getSide() * square.getSide();
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        totalArea += (0.5) * triangle.getBase() * triangle.getHeight();
    }

    public double getTotalArea() {
        return totalArea;
    }
}
