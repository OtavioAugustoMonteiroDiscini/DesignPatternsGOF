package com.mycompany.projetoformaprototype;

public class Cliente {
    public static void main(String[] args) {
        Circulo circuloOriginal = new Circulo(10);
        Circulo circuloClonado = (Circulo) circuloOriginal.clonar();

        circuloOriginal.desenhar();
        circuloClonado.desenhar();
    }
}
