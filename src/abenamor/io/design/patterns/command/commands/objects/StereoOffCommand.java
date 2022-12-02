package abenamor.io.design.patterns.command.commands.objects;

import abenamor.io.design.patterns.command.Command;
import abenamor.io.design.patterns.command.receivers.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
