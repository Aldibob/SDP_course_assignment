package strategy;

public class Main {
    static void main() {
        CalculationContext context = new CalculationContext(new AdditionStrategy());
        double addition_Number1 = 15.5f;
        double addition_Number2 = 15.5f;
        context.showCalculation(addition_Number1, addition_Number2);


        context.setCalculationStrategy(new SubtractionStrategy());
        double subtraction_Number1 = 13.1f;
        double subtraction_Number2 = 13.1f;
        context.showCalculation(subtraction_Number1, subtraction_Number2);


        context.setCalculationStrategy(new MultiplicationStrategy());
        double multiplication_number1 = 2.4f;
        double multiplication_number2 = 2.4f;
        context.showCalculation(multiplication_number1, multiplication_number2);

        context.setCalculationStrategy(new DivisionStrategy());
        double division_Number1 = 4f;
        double division_Number2 = 6.5f;
        context.showCalculation(division_Number1, division_Number2);

        context.setCalculationStrategy(new DivisionStrategy());
        double division_Number3 = 4f;
        double division_Number4 = 0f;
        context.showCalculation(division_Number3, division_Number4);
    }
}