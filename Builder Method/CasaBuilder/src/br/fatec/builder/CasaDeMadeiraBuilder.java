package br.fatec.builder;

import br.fatec.produto.Casa;

public class CasaDeMadeiraBuilder implements CasaBuilder{

    private Casa casa;

    @Override
    public void criarNovaCasa() {
        casa = new Casa();
    }

    @Override
    public void construirEstrutura() {
        casa.setEstrutura("madeira");
    }

    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhado de madeira");
    }

    @Override
    public void construirInterior() {
        casa.setInterior("Casa com interior rustico de madeira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
