package br.fatec.factory;

import br.fatec.model.Moto;
import br.fatec.model.Veiculo;

public class MotoFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo(){
        return new Moto();
    }
}