package ElevatorSystem.Dispatchers;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.Utility.ElevatorManager;

public class ExternalButtonDispatcher {

    public void makeRequest(ElevatorManager elevatorManager, int floor, Direction dir) {
        elevatorManager.manageRequest(floor, dir);
    }
}
