import WithStrategyDesignPattern.DriveStrategies.NormalDriveStrategy;
import WithStrategyDesignPattern.DriveStrategies.SpecialDriveStrategy;
import WithStrategyDesignPattern.OffRoadVehicle;
import WithStrategyDesignPattern.PassengerVehicle;

public class Main {
    public static void main(String[] args) {
        SpecialDriveStrategy specialDriveStrategy = new SpecialDriveStrategy();
        OffRoadVehicle vehicle = new OffRoadVehicle(specialDriveStrategy);
        vehicle.drive();
        NormalDriveStrategy normalDriveStrategy = new NormalDriveStrategy();
        PassengerVehicle passengerVehicle = new PassengerVehicle(normalDriveStrategy);
        passengerVehicle.drive();
    }
}