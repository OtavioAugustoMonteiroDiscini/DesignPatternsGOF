package br.fatec.cliente;

import br.fatec.builder.BuilderSanduicheFrango;
import br.fatec.builder.BuilderSanduicheVegetariano;
import br.fatec.builder.SanduicheBuilder;
import br.fatec.diretor.Diretor;
import br.fatec.produto.Sanduiche;

public class Cliente {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        SanduicheBuilder frango = new BuilderSanduicheFrango();
        diretor.setBuilder(frango);
        Sanduiche sanduiche = diretor.fazerSanduiche();
        System.out.println(sanduiche);

        SanduicheBuilder vegan = new BuilderSanduicheVegetariano();
        diretor.setBuilder(vegan);
        sanduiche = diretor.fazerSanduiche();
        System.out.println(sanduiche);

    }
}
