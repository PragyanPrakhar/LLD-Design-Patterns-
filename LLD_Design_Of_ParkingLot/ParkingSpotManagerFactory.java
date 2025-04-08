package LLD_Design_Of_ParkingLot;

import java.util.List;

class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        if (vehicleType == VehicleType.TwoWheeler)
            return new TwoWheelerManager(spots);
        else if (vehicleType == VehicleType.FourWheeler)
            return new FourWheelerManager(spots);
        else
            return null; // Handle error
    }
}