package br.fatec.produto;

public class Carro {

    private String transmissão;
    private String motor;
    private boolean arCondicionado;

    public void setTransmissão(String transmissão) {
        this.transmissão = transmissão;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String toString(){

        String transmissaoTexto = (this.transmissão.equalsIgnoreCase("Automatico")) ? "Porsche" : "C4 Pallas";


        return   transmissaoTexto + "\n[Transimissão: " + this.transmissão + "]"+
                "\n[Motor: " + this.motor + "]" +
                "\n[Ar condicionado: " + this.arCondicionado + "]";
    }
}
