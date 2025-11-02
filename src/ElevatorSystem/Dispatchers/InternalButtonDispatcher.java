package ElevatorSystem.Dispatchers;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.Utility.ElevatorManager;

public class InternalButtonDispatcher {

    public static void makeRequest(ElevatorManager elevatorManager, int floor, Direction dir) {
        elevatorManager.manageRequest(floor, dir);
    }
}
