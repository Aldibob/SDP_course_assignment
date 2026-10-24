package strategy;

public class MultiplicationStrategy implements CalculationStrategy {

    @Override
    public void calculate(double a, double b) {
        double result = a * b;
        // limit the output of digits after the decimal point to 2
        System.out.printf("%.2f%n", result);
    }
}
