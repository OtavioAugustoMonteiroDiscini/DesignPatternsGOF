package br.fatec.cliente;

import br.fatec.factory.CarroFactory;
import br.fatec.factory.MotoFactory;
import br.fatec.model.Moto;
import br.fatec.model.Veiculo;

public class Cliente {
    public static void main(String[] args) {
        CarroFactory cf = new CarroFactory();
        Veiculo carro = cf.criarVeiculo();
        carro.exibirDetalhes();

        MotoFactory mf = new MotoFactory();
        Veiculo moto = mf.criarVeiculo();
        moto.exibirDetalhes();
    }
}
