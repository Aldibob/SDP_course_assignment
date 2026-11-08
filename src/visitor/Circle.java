package visitor;

import java.util.Objects;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Radius must be finite and positive");
        }
        this.radius = radius;
    }

     public double getRadius() {
        return radius;
     }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        Objects.requireNonNull(shapeVisitor, "Shape visitor cannot be null");
        shapeVisitor.visit(this);
    }
}
