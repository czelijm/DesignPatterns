package designpatterns.structural.bridge;

public class BridgeDemo {
    public static void runDemo() {
        RemoteControl remoteControl =new RemoteControl(new SonyTV());
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        RemoteControl remoteControlSamsung = new RemoteControl(new SamsungTV());

        remoteControl.turnOn();
        advancedRemoteControl.turnOn();
        advancedRemoteControl.setChannel(5);
        remoteControlSamsung.turnOn();

    }
}
