package br.fatec.builder;

import br.fatec.produto.Carro;

public class CarroManualBuilder implements CarroBuilder{

    Carro carro = new Carro();

    @Override
    public void buildTransmissao() {
        carro.setTransmissão("Manual");
    }

    @Override
    public void buildMotor() {
        carro.setMotor("2.0L Turbo");
    }

    @Override
    public void buildArCondicionado() {
        carro.setArCondicionado(false);
    }

    @Override
    public Carro getResult() {
        return carro;
    }
}
