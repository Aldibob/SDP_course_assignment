BUILDER PATTERN, Builder_pattern.Car builder.
Builder_pattern.Car builder is a builder pattern that can help you construct complex object like car, solving problem
with constructors with a massive list of parameters

In folder 'src' i contain all my classes and main.

First i created class Builder_pattern.Car that represents overall characteristics of any car that can be build. Characteristics like fields, getters and setters so that users can
set their own characteristics.

Then i created inteface Builder_pattern.CarBuilder that i implemented in my concrete builders.

Builder_pattern.CarDirector is a director of my concrete builders. This class cointains prepared in advance configurations of each concrete builder.

Concerete builders, Builder_pattern.DailyCar and Builder_pattern.SportCar each represent it's type of car, for example: Cars for daily usage that prioritize comfort, trunk capacity and so on.
Sport cars for races and drift.


FACTORY METHOD AND ABSTRACT FACTORY

MAIN IDEA

The Factory Method pattern defines a method for creating an object, while allowing subclasses to decide which concrete object should be created.
Instead of creating objects directly with new in the client code, object creation is delegated to a factory method.

The Abstract Factory pattern provides an interface for creating families of related objects without specifying their concrete classes.
A factory is responsible for creating several related products that are designed to work together.

STRUCTURE

Abstract Factory(VehicleFactory) — declares methods for creating products.
Concrete Factories(BMWFactory, HondaFactory) — create a specific family of products.
Abstract Products(Car and Motorcycle) — interfaces for product types.
Concrete Products(HondaCar, BMWCar and etc.) — implementations belonging to a specific product family.
Client(Main) — works only with abstract interfaces.

ADVANTAGES

Reduces coupling between client code and concrete classes.
Uses polymorphism instead of conditional type checking.
Makes it easier to add new product types.
Keeps object creation in a dedicated place.

Creates compatible families of objects.
Keeps concrete classes hidden from the client.
Makes it easier to switch between product families.
Reduces dependencies between the client and concrete implementations.

I created it with IDE intelliJ IDEA (Akhtanov Aldiyar)
