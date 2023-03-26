package WithStrategyDesignPattern.DriveStrategies;

import WithStrategyDesignPattern.DriveStrategies.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy");
    }
}
