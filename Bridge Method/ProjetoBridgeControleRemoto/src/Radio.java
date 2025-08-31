public class Radio implements Device{
   int volume = 20;
   boolean ligado = false;


    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Ligando rádio");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando rádio");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume do rádio ajustado para " + volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }
}
