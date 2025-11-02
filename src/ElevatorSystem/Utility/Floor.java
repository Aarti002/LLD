package ElevatorSystem.Utility;

import ElevatorSystem.Enums.Direction;

public class Floor {
    private int floorNo;
    private ExternalButton externalButton;

    public Floor(int floorNo, ElevatorManager manager) {
        this.floorNo = floorNo;
        this.externalButton = new ExternalButton(manager);
    }

    public int getFloorNo() {
        return floorNo;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void requestElevator(Direction dir) {

        externalButton.pressButton(floorNo, dir);
    }
}
