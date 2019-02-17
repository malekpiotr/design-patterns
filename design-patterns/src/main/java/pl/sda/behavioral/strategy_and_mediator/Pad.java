package pl.sda.behavioral.strategy_and_mediator;

public class Pad implements IControler{
    @Override
    public ControllerData readControllerData() {
        System.out.println("set PAD");
        return new ControllerData(5,10);
    }
}