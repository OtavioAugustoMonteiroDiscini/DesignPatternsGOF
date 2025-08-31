package com.mycompany.projetoanimalprototype;

public class Cliente {
    public static void main(String[] args) {
        Animal animal = new Cachorro("Neguin", "Vira-Lata");
        Animal novoAnimal = animal.clone();

        novoAnimal.setNome("Caramelo");
        novoAnimal.setRaça("Vira-Lata");

        System.out.println("Cachorro 1: " + animal.getNome() +" "+ animal.getRaca());

        System.out.println("Cachorro 2: " + novoAnimal.getNome() +" " + animal.getRaca());


    }
}
