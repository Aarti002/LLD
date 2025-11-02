package ElevatorSystem.Utility;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.SchedulingStrategyImpl.SchedulingStrategy;

public class ElevatorManager {
    private Building building;
    private Elevator lift;
    private SchedulingStrategy strategy;

    public ElevatorManager(Building building, Elevator lift, SchedulingStrategy strategy) {
        this.building = building;
        this.lift = lift;
        this.strategy = strategy;
    }

    public void manageRequest(int floor, Direction dir) {
        strategy.addRequest(floor, dir);
    }

    public void manageNextMove() {
        while (strategy.hasPendingRequest()) {
            int nextFloor = strategy.getNextFloor();
            if (nextFloor == -1) {
                break;
            }
            Direction dir = (lift.getState().getFloor() < nextFloor) ? Direction.UP : Direction.DOWN;
            lift.moveElevator(nextFloor, dir);
        }
    }
}
