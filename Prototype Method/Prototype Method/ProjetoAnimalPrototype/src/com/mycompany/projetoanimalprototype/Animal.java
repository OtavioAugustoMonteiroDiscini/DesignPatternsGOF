package com.mycompany.projetoanimalprototype;

public class Animal implements AnimalPrototype{

    private String nome;
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaça(String raca) {
        this.raca = raca;
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Animal clone() {
        return new Animal(this.nome, this.raca);
    }
}
