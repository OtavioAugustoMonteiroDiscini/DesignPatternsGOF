package br.fatec.cliente;

import br.fatec.builder.BuilderPCBasico;
import br.fatec.builder.BuilderPCGamer;
import br.fatec.builder.BuilderPCWorkStation;
import br.fatec.builder.PCBuilder;
import br.fatec.diretor.Diretor;
import br.fatec.produto.Computador;

public class Client {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        PCBuilder basic = new BuilderPCBasico();
        diretor.setBuilder(basic);
        Computador computador = diretor.fazerPC();
        System.out.println(computador);

        PCBuilder gamer = new BuilderPCGamer();
        diretor.setBuilder(gamer);
        computador = diretor.fazerPC();
        System.out.println(computador);

        PCBuilder work = new BuilderPCWorkStation();
        diretor.setBuilder(work);
        computador = diretor.fazerPC();
        System.out.println(computador);

    }
}
