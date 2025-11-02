package ElevatorSystem.Utility;

import ElevatorSystem.Dispatchers.InternalButtonDispatcher;
import ElevatorSystem.Enums.Direction;

public class InternalButton {
    private final ElevatorManager elevatorManager;
    private static final InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();

    public InternalButton(ElevatorManager manager) {
        this.elevatorManager = manager;
    }

    public void pressButton(int floor, Direction dir) {
        System.out.println("Internal request for floor " + floor + " pressed " + dir + " button.");
        internalButtonDispatcher.makeRequest(elevatorManager, floor, dir);
    }
}
