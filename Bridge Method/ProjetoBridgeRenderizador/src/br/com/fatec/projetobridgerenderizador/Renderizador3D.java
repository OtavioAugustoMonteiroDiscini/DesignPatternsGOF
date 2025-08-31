package br.com.fatec.projetobridgerenderizador;

public class Renderizador3D implements Renderizador{
    @Override
    public void renderizarForma(String nome) {
        System.out.println("Renderizando " + nome + " em 3D");
    }
}
