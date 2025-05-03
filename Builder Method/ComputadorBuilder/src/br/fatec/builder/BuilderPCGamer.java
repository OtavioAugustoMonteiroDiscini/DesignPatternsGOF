package br.fatec.builder;

import br.fatec.produto.Computador;

public class BuilderPCGamer implements PCBuilder {
    private Computador computador = new Computador();

    @Override
    public void definirProcessador() {
        computador.setProcessador("AMD Ryzen 7");
    }

    @Override
    public void definirMemoriaRAM() {
        computador.setMemoriaRAM("32GB");
    }

    @Override
    public void definirArmazenamento() {
        computador.setArmazenamento("SSD 1TB");
    }

    @Override
    public void definirSistemaOperacional() {
        computador.setSistemaOperacional("Windows 11");
    }

    @Override
    public void definirPlacaVideo() {
        computador.setPlacaVideo("NVIDIA RTX 4080");
    }

    @Override
    public Computador obterResultado() {
        return computador;
    }
}
