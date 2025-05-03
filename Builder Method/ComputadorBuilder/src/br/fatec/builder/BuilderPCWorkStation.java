package br.fatec.builder;

import br.fatec.produto.Computador;

public class BuilderPCWorkStation implements PCBuilder {
    private Computador computador = new Computador();

    @Override
    public void definirProcessador() {
        computador.setProcessador("Intel Xeon");
    }

    @Override
    public void definirMemoriaRAM() {
        computador.setMemoriaRAM("64 GB");
    }

    @Override
    public void definirArmazenamento() {
        computador.setArmazenamento("SSD 2TB + HD 4TB");
    }

    @Override
    public void definirSistemaOperacional() {
        computador.setSistemaOperacional("Windows 11 Pro");
    }

    @Override
    public void definirPlacaVideo() {
        computador.setPlacaVideo("NVIDIA Quadro RTX");
    }

    @Override
    public Computador obterResultado() {
        return computador;
    }
}
