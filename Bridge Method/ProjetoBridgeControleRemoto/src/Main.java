//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Device tv = new TV();

    RemoteControl controle = new RemoteControl(tv);
    controle.togglePower();
    controle.volumeUP();
    controle.togglePower();

        System.out.println();

    Device radio = new Radio();
    AdvancedRemoteControl controleR = new AdvancedRemoteControl(radio);
    controleR.togglePower();
    controleR.volumeUP();
    controleR.mute();
    controleR.togglePower();


    }
}