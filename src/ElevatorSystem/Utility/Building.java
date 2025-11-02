package ElevatorSystem.Utility;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private final String apartmentName;
    private final List<Floor> allFloors = new ArrayList<>();

    public Building(String name) {
        this.apartmentName = name;
    }

    public void addFloor(Floor floor) {
        allFloors.add(floor);
    }

    public Floor getFloor(int floorNo) {
        return allFloors.stream()
                .filter(f -> f.getFloorNo() == floorNo)
                .findFirst()
                .orElse(null);
    }

    public int totalFloors() {
        return allFloors.size();
    }

    public String getApartmentName() {
        return apartmentName;
    }
}
