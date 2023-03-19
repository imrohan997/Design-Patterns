package LiskovSubstitutionPrinciple;

public class Cycle implements Bike{

    int speed;
    @Override
    public void turnOnEngine() {
        throw new Exception("Engine doesn't exist.")
    }

    @Override
    public void accelarate(int speed) {
        this.speed = speed;
    }
}
