package visitor;

public class Main {
    public static void main(String[] args) {
        Shape[] arrayShape = new Shape[]{
                new Circle(6),
                new Square(4),
                new Triangle(5, 4)
        };

        AreaCalculatorVisitor calculatorVisitor = new AreaCalculatorVisitor();
        ExportVisitor exportVisitor = new ExportVisitor();

        for (Shape shape : arrayShape) {
            shape.accept(calculatorVisitor);
            shape.accept(exportVisitor);
        }

        System.out.println("Total Area: " + calculatorVisitor.getTotalArea());
    }
}
