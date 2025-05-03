package br.fatec.factory;

import br.fatec.criadordepersonagens.Personagem;

public abstract class PersonagemFactory {
    public abstract Personagem criarPersonagem(String classe);
}
