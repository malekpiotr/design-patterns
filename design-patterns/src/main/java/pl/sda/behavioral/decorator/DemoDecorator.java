package pl.sda.behavioral.decorator;

public class DemoDecorator {
    public static void main(String[] args) {

        Calculator calculator = new LoggingCalculatorDecorator(new Calculator());
        int result = calculator.add(2,2);
        System.out.println(result);

        calculator.subtract(5,3);

        calculator = new NewLogginCalculatorDecorator(calculator);
        calculator.add(5,3);

    }
}
