package strategy;

public class Main {
    static void main() {
        CalculationContext context = new CalculationContext(new AdditionStrategy());
        double additionNumber1 = 15.5;
        double additionNumber2 = 15.5;
        context.executeCalculation(additionNumber1, additionNumber2);


        context.setCalculationStrategy(new SubtractionStrategy());
        double subtractionNumber1 = 13.1;
        double subtractionNumber2 = 13.1;
        context.executeCalculation(subtractionNumber1, subtractionNumber2);


        context.setCalculationStrategy(new MultiplicationStrategy());
        double multiplicationNumber1 = 2.4;
        double multiplicationNumber2 = 2.4;
        context.executeCalculation(multiplicationNumber1, multiplicationNumber2);

        context.setCalculationStrategy(new DivisionStrategy());
        double divisionNumber1 = 4f;
        double divisionNumber2 = 6.5;
        context.executeCalculation(divisionNumber1, divisionNumber2);

        context.setCalculationStrategy(new DivisionStrategy());
        double divisionNumber3 = 4;
        double divisionNumber4 = 0;
        context.executeCalculation(divisionNumber3, divisionNumber4);
    }
}