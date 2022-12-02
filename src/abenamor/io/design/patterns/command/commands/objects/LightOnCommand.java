package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
