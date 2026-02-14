package RemoteControlUndoRedoSystem.ConcreteCommand;

import RemoteControlUndoRedoSystem.Command.ICommand;
import RemoteControlUndoRedoSystem.Receiver.Light;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }

    @Override
    public void undo() {
        light.turnOnLight();
    }
}
