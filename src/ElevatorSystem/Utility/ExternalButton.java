package ElevatorSystem.Utility;

import ElevatorSystem.Dispatchers.ExternalButtonDispatcher;
import ElevatorSystem.Enums.Direction;

public class ExternalButton {
    private final ElevatorManager elevatorManager;
    private static final ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();

    public ExternalButton(ElevatorManager manager) {
        this.elevatorManager = manager;
    }

    public void pressButton(int floor, Direction dir) {
        System.out.println("External request for floor " + floor + " pressed " + dir + " button.");
        externalButtonDispatcher.makeRequest(elevatorManager, floor, dir);
    }
}
