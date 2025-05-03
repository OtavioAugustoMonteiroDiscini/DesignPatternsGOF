package br.fatec.builder;

import br.fatec.produto.Personagem;

public class BuilderMago implements PersonagemBuilder{

    private Personagem personagem = new Personagem();

    @Override
    public void definirNome() {
        personagem.setNome("Veigar");
    }

    @Override
    public void definirClasse() {
        personagem.setClasse("Mago");
    }

    @Override
    public void definirArma() {
        personagem.setArma("Cajado");
    }

    @Override
    public void definirArmadura() {
        personagem.setArmadura(null);
    }

    @Override
    public Personagem obterResultado() {
        return personagem;
    }
}
