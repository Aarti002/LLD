package VehicleRentalSystem.Core;

public class User {
    private final int id;
    private final String userName;
    private boolean hasDL;

    public User(int id, String name) {
        this.id = id;
        this.userName = name;
    }

    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setHasDL(boolean dl) {
        this.hasDL = dl;
    }

    public boolean getDL() {
        return this.hasDL;
    }
}
