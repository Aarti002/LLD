package RemoteControlUndoRedoSystem.ConcreteCommand;

import RemoteControlUndoRedoSystem.Command.ICommand;
import RemoteControlUndoRedoSystem.Receiver.AirConditioner;

public class ACOnCommand implements ICommand {
    private AirConditioner ac;

    public ACOnCommand(AirConditioner nac) {
        this.ac = nac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
