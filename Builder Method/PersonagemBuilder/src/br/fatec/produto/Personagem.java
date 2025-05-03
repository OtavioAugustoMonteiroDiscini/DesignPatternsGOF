package br.fatec.produto;

public class Personagem {
    private String nome;
    private String classe;
    private String arma;
    private String armadura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String toString(){
        return "Nome: " + nome + " Classe: " + classe + " Arma: " + arma + " Armadura: " + armadura;
    }
}
