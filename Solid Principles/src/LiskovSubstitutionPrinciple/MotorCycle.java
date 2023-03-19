package LiskovSubstitutionPrinciple;

public class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelarate(int speed) {
        this.speed = speed;
    }
}
