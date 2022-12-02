package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
