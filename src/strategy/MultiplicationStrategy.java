package strategy;

public class MultiplicationStrategy implements CalculationStrategy {

    @Override
    public void calculate(double a, double b) {
        double result = a * b;
        System.out.printf("%.2f%n", result);
    }
}
