package ElevatorSystem.SchedulingStrategyImpl;

import ElevatorSystem.Enums.Direction;

public interface SchedulingStrategy {
    void addRequest(int floor, Direction dir);
    int getNextFloor();
    boolean hasPendingRequest();
}
