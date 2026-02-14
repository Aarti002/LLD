package RemoteControlUndoRedoSystem.ConcreteCommand;

import RemoteControlUndoRedoSystem.Command.ICommand;
import RemoteControlUndoRedoSystem.Receiver.AirConditioner;

public class SetACTemperatureCommand implements ICommand {
    private AirConditioner ac;
    private int temp;

    public SetACTemperatureCommand(AirConditioner nac, int t) {
        this.ac = nac;
        this.temp = t;
    }

    @Override
    public void execute() {
        ac.setTemperature(temp);
    }

    @Override
    public void undo() {
        ac.setTemperature(24);
    }
}
