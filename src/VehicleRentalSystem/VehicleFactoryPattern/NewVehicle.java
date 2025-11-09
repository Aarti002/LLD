package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleStatus;
import VehicleRentalSystem.Enums.VehicleType;

public abstract class NewVehicle {
    private int id;
    public VehicleType type;
    private String vehicleNum;
    private VehicleStatus status;

    NewVehicle(VehicleType type) {
        this.type = type;
    }

    public abstract int getCharge();
    public abstract int getDamageCharge();

    public void setVehicleNum(String num) {
        this.vehicleNum = num;
    }

    public void setVehicleStatus(VehicleStatus status) {
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleStatus getStatus() {
        return this.status;
    }

    public VehicleType getType() {
        return this.type;
    }
}
