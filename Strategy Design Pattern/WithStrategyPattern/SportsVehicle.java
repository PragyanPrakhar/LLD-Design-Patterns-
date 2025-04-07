package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
    // here we have passes sportsDrive strategy to the constructor of the parent class.

}
