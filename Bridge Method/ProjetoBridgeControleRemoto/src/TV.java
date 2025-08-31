public class TV implements Device{

   int volume = 10;
   boolean ligado = false;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("TV Ligando");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("TV Desligando");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Volume da TV ajustado para " + volume);
        this.volume = volume;
    }



    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isLigado() {
        return this.ligado;
    }
}
