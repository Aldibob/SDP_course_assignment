package strategy;

public class DivisionStrategy implements CalculationStrategy {

    @Override
    public void calculate(double a, double b) {
        if (b == 0.0) {
            System.out.println("You can not divide by zero!");

        } else {
            double result = a / b;
            System.out.println(result);
        }
    }
}
