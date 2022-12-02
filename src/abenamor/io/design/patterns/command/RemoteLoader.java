package abenamor.io.design.patterns.command;

import abenamor.io.design.patterns.command.commands.objects.*;
import abenamor.io.design.patterns.command.receivers.GarageDoor;
import abenamor.io.design.patterns.command.receivers.Light;
import abenamor.io.design.patterns.command.receivers.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOffCommand kitchenLightOnCommand = new LightOffCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2,garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(3,stereoOnCommand, stereoOffCommand);

        for (int i = 0; i < 4; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            System.out.println("--------------------------------------------------");
        }

    }
}
