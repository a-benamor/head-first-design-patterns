package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.Sprinkler;

public class SprinklerOnCommand implements Command {
    private Sprinkler sprinkler;

    public SprinklerOnCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOn();
    }

    @Override
    public void undo() {
        sprinkler.waterOff();
    }
}
