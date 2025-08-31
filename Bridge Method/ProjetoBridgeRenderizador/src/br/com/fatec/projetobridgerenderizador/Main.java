package br.com.fatec.projetobridgerenderizador;

public class Main {
    public static void main(String[] args) {

        Forma forma1 = new Circulo(new Renderizador3D());
        forma1.desenhar();

        Forma forma2 = new Circulo(new Renderizador2D());
        forma2.desenhar();

        Forma quadrado1 = new Quadrado(new Renderizador2D());
        quadrado1.desenhar();

        Forma quadrado2 = new Quadrado(new Renderizador3D());
        quadrado2.desenhar();


    }
}