package RemoteControlUndoRedoSystem.ConcreteCommand;

import RemoteControlUndoRedoSystem.Command.ICommand;
import RemoteControlUndoRedoSystem.Receiver.AirConditioner;

public class ACOffCommand implements ICommand {
    private AirConditioner ac;

    public ACOffCommand(AirConditioner nac) {
        this.ac = nac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
