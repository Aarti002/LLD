package InventoryManagementSystem.Utility;

public class Location {
    private final String state;
    private final String pinCode;

    public Location(String state, String pin) {
        this.state = state;
        this.pinCode = pin;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }
}
