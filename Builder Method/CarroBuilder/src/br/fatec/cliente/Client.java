package br.fatec.cliente;

import br.fatec.builder.CarroAutomaticoBuilder;
import br.fatec.builder.CarroBuilder;
import br.fatec.builder.CarroManualBuilder;
import br.fatec.diretor.Diretor;
import br.fatec.produto.Carro;

public class Client {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

//        carro automatico
        CarroBuilder automaticoBuilder = new CarroAutomaticoBuilder();
        diretor.setBuilder(automaticoBuilder);
        Carro carro = diretor.construirCarro();
        System.out.println(carro);


//        Carro manual
        CarroBuilder manualBuilder = new CarroManualBuilder();
        diretor.setBuilder(manualBuilder);
        carro =diretor.construirCarro();
        System.out.println(carro);


    }
}
