package visitor;

public class ExportVisitor implements ShapeVisitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Radius of the Circle: " + circle.getRadius());
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Side of the Square: " + square.getSide());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Base of the Triangle: " + triangle.getBase());
        System.out.println("Height of the Triangle: " + triangle.getHeight());
    }
}
