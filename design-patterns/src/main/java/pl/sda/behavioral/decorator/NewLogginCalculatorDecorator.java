package pl.sda.behavioral.decorator;

import pl.sda.creational.SingletonLogger;

public class NewLogginCalculatorDecorator extends Calculator {

    private final Calculator calculator;

    public NewLogginCalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public int add(int a, int b) {
        SingletonLogger.getInstance().log("START");
        int result = calculator.add(a, b);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
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

