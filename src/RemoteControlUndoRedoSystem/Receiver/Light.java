package RemoteControlUndoRedoSystem.Receiver;

public class Light {
    private boolean currStatus;

    public Light() {
        this.currStatus = false;
    }

    public void turnOnLight() {
        this.currStatus = true;
        System.out.println("Light is on.");
    }

    public void turnOffLight() {
        this.currStatus = false;
        System.out.println("Light is off.");
    }

    public void getLightStatus() {
        System.out.println("Light is currently: "+this.currStatus);
    }
}
