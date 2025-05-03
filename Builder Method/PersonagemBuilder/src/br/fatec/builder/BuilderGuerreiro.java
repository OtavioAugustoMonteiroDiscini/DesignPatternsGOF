package br.fatec.builder;

import br.fatec.produto.Personagem;

public class BuilderGuerreiro implements PersonagemBuilder{

    private Personagem personagem = new Personagem();

    @Override
    public void definirNome() {
        personagem.setNome("Garen");
    }

    @Override
    public void definirClasse() {
        personagem.setClasse("Guerreiro");
    }

    @Override
    public void definirArma() {
        personagem.setArma("Espada");
    }

    @Override
    public void definirArmadura() {
        personagem.setArmadura("Malha");
    }

    @Override
    public Personagem obterResultado() {
        return personagem;
    }
}
