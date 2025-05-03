package br.fatec.diretor;

import br.fatec.builder.PersonagemBuilder;
import br.fatec.produto.Personagem;

public class Diretor {
    private PersonagemBuilder builder;

    public void setBuilder(PersonagemBuilder builder) {
        this.builder = builder;
    }

    public Personagem build() {
        builder.definirArma();
        builder.definirArmadura();
        builder.definirClasse();
        builder.definirNome();

        return builder.obterResultado();
    }
}
