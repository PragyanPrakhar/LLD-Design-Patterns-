package WithoutStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    // different drive logic
    public void drive() {
        System.out.println("Sports Drive Capabilities !");
    }

}
