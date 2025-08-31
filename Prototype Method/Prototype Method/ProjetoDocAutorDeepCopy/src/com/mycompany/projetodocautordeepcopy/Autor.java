package com.mycompany.projetodocautordeepcopy;

public class Autor implements Cloneable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor(String nome) {
        this.nome = nome;
    }

@Override
    public Autor clone(){
        try {
            return(Autor) super.clone();
        } catch (CloneNotSupportedException e ){
            throw new RuntimeException(e);
        }
    }
}
