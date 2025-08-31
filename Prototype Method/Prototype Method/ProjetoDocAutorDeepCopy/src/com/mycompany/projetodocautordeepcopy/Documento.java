package com.mycompany.projetodocautordeepcopy;

public class Documento implements Cloneable{
    private String titulo;
    Autor autor;

    public Documento(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibir(){
        System.out.println("Titulo: " + titulo + ", Autor " + autor.getNome());
    }

    @Override
    public Documento clone(){
        try{
            Documento copia = (Documento) super.clone();
            copia.autor = autor.clone();
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
