package br.fatec.builder;

import br.fatec.produto.Casa;

public interface CasaBuilder {

    void criarNovaCasa();
    void construirEstrutura();
    void construirTelhado();
    void construirInterior();
    Casa getCasa();

}
