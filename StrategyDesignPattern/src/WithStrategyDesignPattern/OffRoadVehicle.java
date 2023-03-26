package WithStrategyDesignPattern;

import WithStrategyDesignPattern.DriveStrategies.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
