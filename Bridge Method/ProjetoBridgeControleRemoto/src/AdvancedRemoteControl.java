public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
        System.out.println("Dispositivo silenciado");
    }
}
