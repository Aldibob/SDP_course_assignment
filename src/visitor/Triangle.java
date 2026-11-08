package visitor;

import java.util.Objects;

public class Triangle implements  Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        if (!Double.isFinite(base) || base <= 0) {
            throw new IllegalArgumentException("Base must be finite and positive");
        }
        if (!Double.isFinite(height) || height <= 0) {
            throw new IllegalArgumentException("Height must be finite and positive");
        }

        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        Objects.requireNonNull(shapeVisitor, "Shape visitor cannot be null");
        shapeVisitor.visitTriangle(this);
    }
}
