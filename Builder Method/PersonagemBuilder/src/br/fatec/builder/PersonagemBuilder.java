package br.fatec.builder;

import br.fatec.produto.Personagem;

public interface PersonagemBuilder {

    void definirNome();
    void definirClasse();
    void definirArma();
    void definirArmadura();

    Personagem obterResultado();
}
