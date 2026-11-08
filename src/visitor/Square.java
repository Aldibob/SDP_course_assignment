package visitor;

import java.util.Objects;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        if (!Double.isFinite(side) || side <= 0) {
            throw new IllegalArgumentException("Side must be finite and positive");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        Objects.requireNonNull(shapeVisitor, "Shape visitor cannot be null");
        shapeVisitor.visit(this);
    }
}
