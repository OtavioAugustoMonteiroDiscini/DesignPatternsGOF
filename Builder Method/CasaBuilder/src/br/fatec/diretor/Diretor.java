package br.fatec.diretor;

import br.fatec.builder.CasaBuilder;
import br.fatec.produto.Casa;

public class Diretor {
    private CasaBuilder builder;

    public void setBuilder(CasaBuilder builder) {
        this.builder = builder;
    }

    public Casa construirCasa(){
        builder.criarNovaCasa();
        builder.construirEstrutura();
        builder.construirTelhado();
        builder.construirInterior();
        return builder.getCasa();
    }
}
