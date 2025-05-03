package br.fatec.builder;

import br.fatec.produto.Computador;

public class BuilderPCBasico implements PCBuilder{

    private Computador computador = new Computador();

    @Override
    public void definirProcessador() {
        computador.setProcessador("Intel I3");
    }

    @Override
    public void definirMemoriaRAM() {
        computador.setMemoriaRAM("8 GB");
    }

    @Override
    public void definirArmazenamento() {
        computador.setArmazenamento("HD 500GB");
    }

    @Override
    public void definirSistemaOperacional() {
        computador.setSistemaOperacional("Linux");
    }

    @Override
    public void definirPlacaVideo() {
        computador.setPlacaVideo("Integrada");
    }

    @Override
    public Computador obterResultado() {
        return computador;
    }
}
