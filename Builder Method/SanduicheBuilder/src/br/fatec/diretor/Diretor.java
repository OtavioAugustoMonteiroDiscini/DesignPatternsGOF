package br.fatec.diretor;

import br.fatec.builder.SanduicheBuilder;
import br.fatec.produto.Sanduiche;

public class Diretor {
        private SanduicheBuilder builder;

    public void setBuilder(SanduicheBuilder builder) {
        this.builder = builder;
    }

        public Sanduiche fazerSanduiche(){

            builder.definirPao();
            builder.definirCarne();
            builder.definirMolho();
            builder.definirQueijo();
            builder.definirSalada();

            return builder.obterSanduiche();
        }
}
