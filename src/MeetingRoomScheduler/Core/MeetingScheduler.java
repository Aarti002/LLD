package MeetingRoomScheduler.Core;

import java.util.List;

public class MeetingScheduler {
    int startTime;
    int endTime;

    public MeetingScheduler(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private MeetingRoom getAvailableMeetingRooms(List<MeetingRoom> meetingRooms) {
        for(MeetingRoom r:meetingRooms) {
            if (r.isAvailable) {
                List<Integer> strTime = r.getStartTime();
                List<Integer> enTime = r.getEndTime();
                if(strTime.isEmpty()) {
                    return r;
                }
                boolean flag = true;
                for (int i = 0; i < strTime.size(); i++) {
                    if (startTime >= strTime.get(i) && startTime <= enTime.get(i)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    return r;
                }
            }
        }
        System.out.println("Apologies, all meeting rooms are occupied.");
        return null;
    }

    boolean scheduleMeeting(List<MeetingRoom> meetingRooms,User requester) {
        MeetingRoom room = getAvailableMeetingRooms(meetingRooms);
        if(room!=null) {
            room.setTimeWindow(startTime, endTime);
            if(room.getStartTime().size() == 3) {
                room.setAvailability(false);
            }

            System.out.println("Meeting room booked, Please find the preview below: ");
            System.out.println("Room Name: "+room.getName());
            System.out.println("Requester: "+requester.getName());
            System.out.println("Room Capacity: "+room.getCapacity());
            System.out.println("Meeting Starts at: "+room.getStartTime());
            System.out.println("Meeting Ends at: "+room.getEndTime());
            return true;
        }
        return false;
    }

}
