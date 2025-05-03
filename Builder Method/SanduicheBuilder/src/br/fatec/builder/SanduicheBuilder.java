package br.fatec.builder;

import br.fatec.produto.Sanduiche;

public interface SanduicheBuilder {
    void definirPao();
    void definirCarne();
    void definirQueijo();
    void definirSalada();
    void definirMolho();

    Sanduiche obterSanduiche();

}
