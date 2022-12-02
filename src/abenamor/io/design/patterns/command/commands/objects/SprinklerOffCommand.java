package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.Sprinkler;

public class SprinklerOffCommand implements Command {
    private Sprinkler sprinkler;

    public SprinklerOffCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOff();
    }

    @Override
    public void undo() {
        sprinkler.waterOn();
    }
}
