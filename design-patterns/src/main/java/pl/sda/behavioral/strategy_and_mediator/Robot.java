package pl.sda.behavioral.strategy_and_mediator;

public class Robot {
    private Position currentPosition;
    private IControler iControler;

    public Robot(IControler iControler) {
        this.iControler = iControler;
    }



    public void updatePosition(Position position) {
        currentPosition = position;
    }

    public void move (){
        ControllerData controllerData = iControler.readControllerData();

    }

    public void changeController(IControler newiControler){
        iControler = newiControler;
    }


}

