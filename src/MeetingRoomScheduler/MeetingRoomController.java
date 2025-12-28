package MeetingRoomScheduler;

import MeetingRoomScheduler.Core.MeetingRoom;
import MeetingRoomScheduler.Core.MeetingRoomAssignment;
import MeetingRoomScheduler.Core.User;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomController {
    public static void main(String[] args) {
        List<MeetingRoom> rooms = new ArrayList<>();
        MeetingRoom mr1 = new MeetingRoom("Ganga", 4);
        MeetingRoom mr2 = new MeetingRoom("Yamuna", 6);

        rooms.add(mr1);
        rooms.add(mr2);

        User user1 = new User(1, "Aarti");
        User user2 = new User(2, "Anil");

        MeetingRoomAssignment roomAssignment = new MeetingRoomAssignment();

        roomAssignment.assignAvailableMeetingRoom(rooms, user1, 1300, 1400);

        roomAssignment.assignAvailableMeetingRoom(rooms, user2, 1330, 1345);
        roomAssignment.assignAvailableMeetingRoom(rooms, user1, 1400, 1500);
        roomAssignment.assignAvailableMeetingRoom(rooms, user2, 1100, 1130);
        roomAssignment.assignAvailableMeetingRoom(rooms, user1, 1105, 1135);
        roomAssignment.assignAvailableMeetingRoom(rooms, user2, 1100, 1130);
    }
}
