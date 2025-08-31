package com.mycompany.projetodocautordeepcopy;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Alice");
        Documento original = new Documento("Relatorio", autor);

        Documento copia = original.clone();

        copia.exibir();
        copia.autor.setNome("Bob");
        copia.exibir();

        original.exibir();
    }
}