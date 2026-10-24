package strategy;

public class AdditionStrategy implements CalculationStrategy {

    @Override
    public void calculate(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }
}
