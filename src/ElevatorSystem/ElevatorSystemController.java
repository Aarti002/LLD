package ElevatorSystem;

import ElevatorSystem.Enums.Direction;
import ElevatorSystem.Enums.ElevatorState;
import ElevatorSystem.SchedulingStrategyImpl.LookSchedulingStrategy;
import ElevatorSystem.Utility.*;

public class ElevatorSystemController {
    public static void main(String[] args) {
        Building building = new Building("Sai Sunrise Apartment");

        Elevator elevator = new Elevator(1, ElevatorState.IDLE);
        LookSchedulingStrategy strategy = new LookSchedulingStrategy(building, elevator);
        ElevatorManager elevatorManager = new ElevatorManager(building, elevator, strategy);

        for (int i = 1; i <= 10; i++) {
            Floor floor = new Floor(i, elevatorManager);
            building.addFloor(floor);
        }

        InternalButton internalButton = new InternalButton(elevatorManager);

        System.out.println(building.getApartmentName() + "'s Elevator at work (super slow but ok)!");
        internalButton.pressButton(3, Direction.UP);
        internalButton.pressButton(7, Direction.DOWN);
        internalButton.pressButton(1, Direction.UP);

        building.getFloor(5).requestElevator(Direction.DOWN);
        building.getFloor(5).getExternalButton().pressButton(5, Direction.DOWN);
        building.getFloor(9).getExternalButton().pressButton(9, Direction.DOWN);
        building.getFloor(2).getExternalButton().pressButton(2, Direction.UP);

        elevatorManager.manageNextMove();
    }
}
