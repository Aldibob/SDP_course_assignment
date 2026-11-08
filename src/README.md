# Visitor Pattern — Shape Visitor

## Overview

This project demonstrates the **Visitor behavioral design pattern** in Java.
It uses a small hierarchy of geometric shapes and two visitors that perform
different operations without placing those operations inside the shape classes.

### Supported shapes

- `Circle` — stores a radius.
- `Square` — stores a side length.
- `Triangle` — stores a base and a height.

### Visitors

- `AreaCalculatorVisitor` — calculates and accumulates the total area of all
  visited shapes.
- `ExportVisitor` — prints the dimensions of each visited shape.

## Technologies

- Java 17
- IntelliJ IDEA (recommended)

## Project structure

The following structure is recommended. If your IntelliJ project uses a
different source-folder layout, keep the same package organization.

```text
VisitorPattern/
├── src/
│   └── visitor/
│       ├── Shape.java
│       ├── ShapeVisitor.java
│       ├── Circle.java
│       ├── Square.java
│       ├── Triangle.java
│       ├── AreaCalculatorVisitor.java
│       ├── ExportVisitor.java
│       └── Main.java
└── README.md
```

All Java files should use the same package declaration, for example:

```java
package visitor;
```

## How to run

1. Open the project in IntelliJ IDEA.
2. Make sure the project SDK is set to **JDK 17 or later**.
3. Check that all classes are in the `visitor` package (or update imports and
   package declarations to match your project).
4. Open `Main.java`.
5. Run the `main` method.

## Example

The `Main` class creates a collection containing a circle, a square, and a
triangle. It then sends both visitors to every shape using `accept()`.

For the example dimensions `Circle(6)`, `Square(4)`, and `Triangle(5, 4)`,
the total area is:

```text
Circle:   36 × π ≈ 113.10
Square:   4 × 4 = 16
Triangle: 0.5 × 5 × 4 = 10
Total:    36 × π + 16 + 10 ≈ 139.10
```

The exact text printed by `ExportVisitor` depends on the messages implemented
in that class.

## Visitor Pattern in this project

`Shape` declares `accept(ShapeVisitor visitor)`. Each concrete shape implements
`accept()` and passes itself to the visitor:

```java
@Override
public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
}
```

`ShapeVisitor` declares one overloaded `visit()` method for every concrete
shape type. This allows Java to select the matching visitor method based on
the concrete shape.

This is an example of **double dispatch**:

1. The client calls `shape.accept(visitor)`.
2. The concrete shape implementation calls `visitor.visit(this)`.
3. The matching `visit(Circle)`, `visit(Square)`, or `visit(Triangle)` method
   is selected.

A new operation can be added by creating another visitor, without changing
the existing shape classes. Adding a new shape type would require updating
the visitor interface and its implementations.

## Author

Individual assignment for **ShP-2216 — Software Design Patterns**,
Astana IT University.
