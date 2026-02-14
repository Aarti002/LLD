package RemoteControlUndoRedoSystem.ConcreteCommand;

import RemoteControlUndoRedoSystem.Command.ICommand;
import RemoteControlUndoRedoSystem.Receiver.Light;

public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }

    @Override
    public void undo() {
        light.turnOffLight();
    }
}
