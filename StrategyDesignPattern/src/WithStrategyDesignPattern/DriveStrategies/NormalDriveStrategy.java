package WithStrategyDesignPattern.DriveStrategies;

import WithStrategyDesignPattern.DriveStrategies.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}