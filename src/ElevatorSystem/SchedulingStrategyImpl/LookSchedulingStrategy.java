package ElevatorSystem.SchedulingStrategyImpl;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.Utility.Building;
import ElevatorSystem.Utility.Elevator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LookSchedulingStrategy implements SchedulingStrategy {
    private Elevator lift;
    private Building building;
    private Queue<Integer> pendingReq = new LinkedList<>();
    private PriorityQueue<Integer> minPq_sameDir =  new PriorityQueue<>();
    private PriorityQueue<Integer> maxPq_oppDir = new PriorityQueue<>(Collections.reverseOrder());

    public LookSchedulingStrategy(Building building, Elevator lift) {
        this.building = building;
        this.lift = lift;
    }

    @Override
    public void addRequest(int floor, Direction dir) {
        if(isFallingInSameTrip(floor, dir)) {
            minPq_sameDir.add(floor);
        } else if(isFallingInNewTrip(floor, dir)) {
            maxPq_oppDir.add(floor);
        } else if(dir == lift.getState().getDir()){
            pendingReq.add(floor);
        }
    }

    private boolean isFallingInSameTrip(int floor, Direction dir) {
        int currFloor = lift.getState().getFloor();
        Direction currDir = lift.getState().getDir();

        return (floor >= currFloor) && (floor <= building.totalFloors()) && (dir == currDir);
    }

    private boolean isFallingInNewTrip(int floor, Direction dir) {
        int currFloor = lift.getState().getFloor();
        Direction currDir = lift.getState().getDir();

        return (floor >= currFloor) && (floor <= building.totalFloors()) && (dir != currDir);
    }

    @Override
    public boolean hasPendingRequest() {
        return !minPq_sameDir.isEmpty() || !maxPq_oppDir.isEmpty() || !pendingReq.isEmpty();
    }

    @Override
    public int getNextFloor() {
        if (!minPq_sameDir.isEmpty()) {
            return minPq_sameDir.poll();
        } else if (!maxPq_oppDir.isEmpty()) {
            return maxPq_oppDir.poll();
        } else if (!pendingReq.isEmpty()) {
            while (!pendingReq.isEmpty()) {
                minPq_sameDir.add(pendingReq.poll());
            }
            return !minPq_sameDir.isEmpty() ? minPq_sameDir.poll() : -1;
        }
        return -1;
    }
}
