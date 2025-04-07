package WithStrategyPattern;
import WithStrategyPattern.Strategy.NormalDriveStrategy;
public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
    // here we have passes NormalDriveStrategy to the constructor of the parent
    // class.
}
