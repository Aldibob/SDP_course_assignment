package strategy;

public class CalculationContext {
    private CalculationStrategy calculationStrategy;

    public CalculationContext(CalculationStrategy strategy) {
        this.calculationStrategy = strategy;
    }

    public void setCalculationStrategy(CalculationStrategy strategy) {
        this.calculationStrategy = strategy;
    }

    public void executeCalculation(double a, double b) {
        calculationStrategy.calculate(a, b);
    }
}
