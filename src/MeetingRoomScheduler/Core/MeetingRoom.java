package MeetingRoomScheduler.Core;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    String name;
    int capacity;
    boolean isAvailable;
    List<Integer> from;
    List<Integer> to;

    public MeetingRoom(String name, int cap) {
        this.name = name;
        this.capacity = cap;
        this.isAvailable = true;
        this.from = new ArrayList<>();
        this.to = new ArrayList<>();
    }

    void setAvailability(boolean state) {
        this.isAvailable = state;
    }

    void setTimeWindow(int s, int e) {
        this.from.add(s);
        this.to.add(e);
    }

    boolean getAvailability() {
        return isAvailable;
    }

    int getCapacity() {
        return capacity;
    }

    String getName() {
        return name;
    }

    List<Integer> getStartTime() {
        return from;
    }

    List<Integer> getEndTime() {
        return to;
    }
}
