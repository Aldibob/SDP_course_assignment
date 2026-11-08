package visitor;

public class ExportVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Radius of the circle: " + circle.getRadius());
    }

    @Override
    public void visit(Square square) {
        System.out.println("Side of the square: " + square.getSide());
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Base of the triangle: " + triangle.getBase());
        System.out.println("Height of the triangle: " + triangle.getHeight());
    }
}
