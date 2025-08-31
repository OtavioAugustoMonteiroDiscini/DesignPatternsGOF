package br.com.fatec.projetobridgerenderizador;

public class Renderizador2D implements Renderizador{
    @Override
    public void renderizarForma(String nome) {
        System.out.println("Renderizado " + nome + " em 2D." );
    }
}
