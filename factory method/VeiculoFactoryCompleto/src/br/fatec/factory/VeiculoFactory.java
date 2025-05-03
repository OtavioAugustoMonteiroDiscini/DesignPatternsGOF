package br.fatec.factory;

import br.fatec.model.Veiculo;

public abstract interface VeiculoFactory {
    public abstract Veiculo criarVeiculo();
}
