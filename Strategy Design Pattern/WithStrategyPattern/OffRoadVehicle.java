package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
    // here we have passes sportsDrive strategy to the constructor of the parent class.
}
