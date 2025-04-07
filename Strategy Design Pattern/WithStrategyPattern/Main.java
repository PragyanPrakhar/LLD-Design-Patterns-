package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        // this drive method will call the drive method of the defined class internally.

    }
    
}
