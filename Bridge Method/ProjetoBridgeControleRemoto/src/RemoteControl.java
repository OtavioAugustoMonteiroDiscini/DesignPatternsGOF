public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isLigado()){
            device.desligar();
        }else {
            device.ligar();
        }
    }

    public void volumeUP(){
        device.setVolume(device.getVolume() + 1);
        System.out.println("Voume aumentado para " + device.getVolume());
    }

    public void volumeDown(){

        device.setVolume(device.getVolume() - 1);
        System.out.println("Voume diminuido para " + device.getVolume());
    }




}
