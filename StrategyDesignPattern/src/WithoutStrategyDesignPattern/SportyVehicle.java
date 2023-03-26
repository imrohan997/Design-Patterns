package WithoutStrategyDesignPattern;

public class SportyVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
