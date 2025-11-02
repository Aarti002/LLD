package ElevatorSystem.Utility;

import ElevatorSystem.Enums.Direction;

public class Display {
    int floor;
    Direction dir;

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Direction getDir() {
        return dir;
    }

    public int getFloor() {
        return floor;
    }
}
