package ElevatorSystem.Utility;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.Enums.ElevatorState;

public class Elevator {
    private int id;
    private Display state;
    private ElevatorState currState;

    public Elevator(int id, ElevatorState currState) {
        this.id = id;
        this.currState = currState;
        this.state = new Display();
    }

    public void moveElevator(int floor, Direction dir) {
        this.currState = ElevatorState.MOVING;
        this.state.setDir(dir);
        this.state.setFloor(floor);
        System.out.println("Elevator " + this.id +
                ", Current Status: Floor " + this.state.getFloor() +
                " Direction " + this.state.getDir());
        this.currState = ElevatorState.IDLE; // reset after reaching
    }

    public Display getState() {
        return state;
    }

    public ElevatorState getCurrState() {
        return currState;
    }

    public int getId() {
        return id;
    }
}
