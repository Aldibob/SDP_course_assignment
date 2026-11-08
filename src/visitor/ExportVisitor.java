package visitor;

public class ExportVisitor implements ShapeVisitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Radius of the circle: " + circle.getRadius());
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Side of the square: " + square.getSide());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Base of the triangle: " + triangle.getBase());
        System.out.println("Height of the triangle: " + triangle.getHeight());
    }
}
