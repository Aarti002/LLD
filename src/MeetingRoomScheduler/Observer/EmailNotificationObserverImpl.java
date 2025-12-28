package MeetingRoomScheduler.Observer;

import MeetingRoomScheduler.Core.MeetingRoomObservable;

public class EmailNotificationObserverImpl implements MeetingRoomObserver {
    MeetingRoomObservable meetingRoomObservable;

    EmailNotificationObserverImpl(MeetingRoomObservable obs) {
        this.meetingRoomObservable = obs;
    }

    @Override
    public void notifyParticipant() {
        System.out.println("Email Notification for meetingRoomObservable");
    }
}
