package pl.sda.behavioral.strategy_and_mediator;

public class KeyboardControler implements IControler {
    @Override
    public ControllerData readControllerData() {
        System.out.println("set KEY");
        return new ControllerData(100, 0);
    }
}
