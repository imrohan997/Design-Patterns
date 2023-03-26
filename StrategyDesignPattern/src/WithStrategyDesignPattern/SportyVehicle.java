package WithStrategyDesignPattern;

import WithStrategyDesignPattern.DriveStrategies.DriveStrategy;

public class SportyVehicle extends Vehicle{
    public SportyVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
