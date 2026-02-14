package RemoteControlUndoRedoSystem;

import RemoteControlUndoRedoSystem.ConcreteCommand.ACOnCommand;
import RemoteControlUndoRedoSystem.ConcreteCommand.LightOnCommand;
import RemoteControlUndoRedoSystem.ConcreteCommand.SetACTemperatureCommand;
import RemoteControlUndoRedoSystem.Invoker.Remote;
import RemoteControlUndoRedoSystem.Receiver.AirConditioner;
import RemoteControlUndoRedoSystem.Receiver.Light;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Light bulb = new Light();

        Remote remote = new Remote();
        remote.setCommand(new LightOnCommand(bulb));
        remote.pressButton();
        remote.setCommand(new ACOnCommand(ac));
        remote.pressButton();
        remote.setCommand(new SetACTemperatureCommand(ac, 19));
        remote.pressButton();

        bulb.getLightStatus();
        ac.showACStatus();

        remote.undo();

        System.out.println("-----------UNDO-----------");

        bulb.getLightStatus();
        ac.showACStatus();
    }
}
