package com.mycompany.projetoformaprototype;

public class Circulo implements Forma{

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public void desenhar(){
        System.out.println("Desenhando um circulo com raio de: " + this.raio);
    }

    @Override
    public Forma clonar() {
        return new Circulo(this.raio);
    }
}
