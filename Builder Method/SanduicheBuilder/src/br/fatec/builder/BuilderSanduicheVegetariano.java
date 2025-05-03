package br.fatec.builder;

import br.fatec.produto.Sanduiche;

public class BuilderSanduicheVegetariano implements SanduicheBuilder{

    private Sanduiche sanduiche = new Sanduiche();

    @Override
    public void definirPao() {
        sanduiche.setPao("Pao italiano");
    }

    @Override
    public void definirCarne() {
        sanduiche.setCarne("Carne de Soja");
    }

    @Override
    public void definirQueijo() {
        sanduiche.setQueijo("Queijo de castanha de caju");
    }

    @Override
    public void definirSalada() {
        sanduiche.setSalada("alface, tomate e rucula");
    }

    @Override
    public void definirMolho() {
        sanduiche.setMolho("Mostarda ketchup e maionese");
    }

    @Override
    public Sanduiche obterSanduiche() {
        return sanduiche;
    }
}
