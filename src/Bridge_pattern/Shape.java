package Bridge_pattern;
// Abstraction: Defines the shape and holds a reference to colors


abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }
    abstract public void create();
}

