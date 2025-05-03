package br.fatec.factory;

import br.fatec.criadordepersonagens.Arqueiro;
import br.fatec.criadordepersonagens.Guerreiro;
import br.fatec.criadordepersonagens.Mago;
import br.fatec.criadordepersonagens.Personagem;

public class CharFactory extends PersonagemFactory{
    @Override
    public Personagem criarPersonagem(String classe) {
        switch (classe.toUpperCase()){
            case "G":
                return new Guerreiro();
            case "M":
                return new Mago();
            case "A":
                return new Arqueiro();
            default:
                throw new IllegalArgumentException("Classe invalida" + classe);
        }

    }
}
