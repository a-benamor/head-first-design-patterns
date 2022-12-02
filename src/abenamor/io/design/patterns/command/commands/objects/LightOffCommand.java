package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
