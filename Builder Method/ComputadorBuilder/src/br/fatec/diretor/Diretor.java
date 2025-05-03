package br.fatec.diretor;

import br.fatec.builder.PCBuilder;
import br.fatec.produto.Computador;

public class Diretor {
    private PCBuilder builder;

    public void setBuilder(PCBuilder builder) {
        this.builder = builder;
    }

    public Computador fazerPC(){
        builder.definirArmazenamento();
        builder.definirPlacaVideo();
        builder.definirMemoriaRAM();
        builder.definirProcessador();
        builder.definirSistemaOperacional();

        return builder.obterResultado();
    }
}
