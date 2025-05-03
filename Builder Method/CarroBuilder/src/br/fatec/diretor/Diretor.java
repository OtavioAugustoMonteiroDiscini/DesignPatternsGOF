package br.fatec.diretor;

import br.fatec.builder.CarroBuilder;
import br.fatec.produto.Carro;

public class Diretor {
    private CarroBuilder builder;

    public void setBuilder(CarroBuilder builder) {
        this.builder = builder;
    }

    public Carro construirCarro(){
        builder.buildTransmissao();
        builder.buildArCondicionado();
        builder.buildMotor();

        return builder.getResult();

    }

}
