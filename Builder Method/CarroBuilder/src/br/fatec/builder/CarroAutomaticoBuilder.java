package br.fatec.builder;

import br.fatec.produto.Carro;

public class CarroAutomaticoBuilder implements CarroBuilder{

    private Carro carro = new Carro();

    @Override
    public void buildTransmissao() {
        carro.setTransmissão("Automatico");
    }

    @Override
    public void buildMotor() {
        carro.setMotor("V8");
    }

    @Override
    public void buildArCondicionado() {
        carro.setArCondicionado(true);
    }

    @Override
    public Carro getResult() {
        return carro;
    }
}
