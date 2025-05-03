package br.fatec.builder;

import br.fatec.produto.Carro;

public interface CarroBuilder {


    void buildTransmissao();

    void buildMotor();

    void buildArCondicionado();

    Carro getResult();
}
