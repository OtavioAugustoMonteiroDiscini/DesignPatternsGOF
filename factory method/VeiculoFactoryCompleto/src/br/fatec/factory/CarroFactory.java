package br.fatec.factory;

import br.fatec.model.Carro;
import br.fatec.model.Veiculo;

public class CarroFactory implements VeiculoFactory {
    @Override
        public Veiculo criarVeiculo(){
        return new Carro();
    }
}
