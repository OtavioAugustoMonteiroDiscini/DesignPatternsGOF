package br.fatec.builder;

import br.fatec.produto.Sanduiche;

public class BuilderSanduicheFrango implements SanduicheBuilder{

    private Sanduiche sanduiche = new Sanduiche();

    @Override
    public void definirPao() {
        sanduiche.setPao("Pão de batata");
    }

    @Override
    public void definirCarne() {
        sanduiche.setCarne("Frango");
    }

    @Override
    public void definirQueijo() {
        sanduiche.setQueijo("Mussarela");
    }

    @Override
    public void definirSalada() {
        sanduiche.setSalada("Alface");
    }

    @Override
    public void definirMolho() {
        sanduiche.setMolho("Maionese");
    }

    @Override
    public Sanduiche obterSanduiche() {
        return sanduiche;
    }
}
