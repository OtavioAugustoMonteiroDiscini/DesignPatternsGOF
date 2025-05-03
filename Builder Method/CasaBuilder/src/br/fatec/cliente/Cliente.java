package br.fatec.cliente;

import br.fatec.builder.CasaBuilder;
import br.fatec.builder.CasaDeMadeiraBuilder;
import br.fatec.builder.CasaDeTijoloBuilder;
import br.fatec.diretor.Diretor;
import br.fatec.produto.Casa;

public class Cliente {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        //Casa de madeira
        CasaBuilder madeiraBuilder = new CasaDeMadeiraBuilder();
        diretor.setBuilder(madeiraBuilder);
        Casa casa = diretor.construirCasa();
        System.out.println(casa);

        //casa de tijolo
        CasaBuilder tijoloBuilder = new CasaDeTijoloBuilder();
        diretor.setBuilder(tijoloBuilder);
        casa = diretor.construirCasa();
        System.out.println(casa);

    }
}
