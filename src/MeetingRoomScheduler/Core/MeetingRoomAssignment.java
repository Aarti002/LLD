package MeetingRoomScheduler.Core;

import java.util.*;

public class MeetingRoomAssignment implements MeetingRoomObservable {
    List<MeetingScheduler> pendingRequests;
    Map<User, MeetingScheduler> requesters;

    public MeetingRoomAssignment() {
        pendingRequests = new ArrayList<>();
        requesters = new HashMap<>();
    }

    public void assignAvailableMeetingRoom(List<MeetingRoom> rooms, User user, int st, int et) {
        MeetingScheduler newSchedule = new MeetingScheduler(st, et);
        if(!newSchedule.scheduleMeeting(rooms, user)){
            pendingRequests.add(newSchedule);
        }

    }

    @Override
    public void isMeetingRoomAvailable(User user,MeetingRoom room) {
        System.out.println("Notification: "+user.getName()+", meeting room("+room.getName()+") is available to occupy.");
    }
}
