package LLD_Design_Of_ParkingLot;

import java.util.List;

class FourWheelerManager extends ParkingSpotManager {
    FourWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        // Implementation to find nearest parking spot for Four Wheelers
        return null;
    }
}
