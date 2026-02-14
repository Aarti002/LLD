package RemoteControlUndoRedoSystem.Receiver;

public class AirConditioner {
    private boolean currStatus;
    private int currTemp;

    public AirConditioner() {
        this.currStatus = false;
        this.currTemp = 24;
    }

    public void setTemperature(int temp){
        this.currTemp = temp;
    }

    public void showACStatus() {
        System.out.println("Current AC status: "+this.currStatus);
        System.out.println("Current AC temp: "+this.currTemp);
    }

    public void turnOnAC() {
        this.currStatus = true;
        System.out.println("AC is on.");
    }

    public void turnOffAC() {
        this.currStatus = false;
        System.out.println("AC is off.");
    }
}
