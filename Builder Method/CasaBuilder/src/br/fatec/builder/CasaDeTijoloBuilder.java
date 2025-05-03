package br.fatec.builder;

import br.fatec.produto.Casa;

public class CasaDeTijoloBuilder implements CasaBuilder{

    private Casa casa;


    @Override
    public void criarNovaCasa() {
        casa = new Casa();
    }

    @Override
    public void construirEstrutura() {
        casa.setEstrutura("Tijolo");
    }

    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhas de cerâmica");
    }

    @Override
    public void construirInterior() {
        casa.setInterior("Interior moderno");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
