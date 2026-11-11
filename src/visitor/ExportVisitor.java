package visitor;

import org.jetbrains.annotations.NotNull;

public class ExportVisitor implements ShapeVisitor {

    @Override
    public void visitCircle(@NotNull Circle circle) {
        System.out.println("Radius of the Circle: " + circle.getRadius());
    }

    @Override
    public void visitSquare(@NotNull Square square) {
        System.out.println("Side of the Square: " + square.getSide());
    }

    @Override
    public void visitTriangle(@org.jetbrains.annotations.NotNull Triangle triangle) {
        System.out.println("Base of the Triangle: " + triangle.getBase());
        System.out.println("Height of the Triangle: " + triangle.getHeight());
    }
}
