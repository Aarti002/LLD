package RemoteControlUndoRedoSystem.Invoker;

import RemoteControlUndoRedoSystem.Command.ICommand;

import java.util.Stack;

public class Remote {
    private ICommand command;
    private Stack<ICommand> pastCmd;

    public Remote() {
        this.pastCmd = new Stack<>();
    }

    public void setCommand(ICommand cmd) {
        this.command = cmd;
        pastCmd.add(cmd);
    }

    public void pressButton() {
        this.command.execute();
    }

    public void undo() {
        if(!pastCmd.empty()) {
            ICommand lastCmd = pastCmd.getLast();
            pastCmd.pop();
            lastCmd.undo();
        }
    }

}
