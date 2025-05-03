package br.fatec.builder;

import br.fatec.produto.Computador;

public interface PCBuilder {
    void definirProcessador();
    void definirMemoriaRAM();
    void definirArmazenamento();
    void definirSistemaOperacional();
    void definirPlacaVideo();

    Computador obterResultado();
}
