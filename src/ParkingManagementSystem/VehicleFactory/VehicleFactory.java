package ParkingManagementSystem.VehicleFactory;


import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.VehicleFactory.ConcreteVehicle.FourWheelerVehicle;
import ParkingManagementSystem.VehicleFactory.ConcreteVehicle.TwoWheelerVehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType, String vehicleNum) {
        if(vehicleType.equals(VehicleType.CAR)) {
            return new FourWheelerVehicle(vehicleNum, vehicleType);
        } else if(vehicleType.equals(VehicleType.BIKE)) {
            return new TwoWheelerVehicle(vehicleNum, vehicleType);
        }
        return null;
    }
}
