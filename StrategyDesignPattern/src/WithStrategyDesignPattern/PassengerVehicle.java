package WithStrategyDesignPattern;

import WithStrategyDesignPattern.DriveStrategies.DriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}