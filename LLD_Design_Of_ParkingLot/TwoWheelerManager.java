package LLD_Design_Of_ParkingLot;

import java.util.List;

class TwoWheelerManager extends ParkingSpotManager {
    TwoWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        // Implementation to find nearest parking spot for Two Wheelers
        return null;
    }
}
