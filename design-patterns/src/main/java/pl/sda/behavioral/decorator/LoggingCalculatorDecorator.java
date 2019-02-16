package pl.sda.behavioral.decorator;

import pl.sda.creational.SingletonLogger;

public class LoggingCalculatorDecorator extends Calculator {
    private final Calculator calculator;

    public LoggingCalculatorDecorator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        int result = calculator.add(a, b);
        SingletonLogger.getInstance().log(a + " + " + b + " = " + result);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        int result = calculator.subtract(a, b);
        SingletonLogger.getInstance().log(a + " - " + b + " = " + result);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        return calculator.divide(a, b);
    }

    @Override
    public boolean isEven(int number) {
        return calculator.isEven(number);
    }

    @Override
    public boolean isOdd(int number) {
        return calculator.isOdd(number);
    }
}
