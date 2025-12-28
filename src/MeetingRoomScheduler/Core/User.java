package MeetingRoomScheduler.Core;

public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }
}