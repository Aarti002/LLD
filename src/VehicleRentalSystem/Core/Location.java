package VehicleRentalSystem.Core;

public class Location {
    private final String stateName;
    private final String statePinCode;

    public Location(String name, String pinCode) {
        this.stateName = name;
        this.statePinCode = pinCode;
    }

    public String getStateName() {
        return this.stateName;
    }

    public String getStatePinCode() {
        return this.statePinCode;
    }
}
