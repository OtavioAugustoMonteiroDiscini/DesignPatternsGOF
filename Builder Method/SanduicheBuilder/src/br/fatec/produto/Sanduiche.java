package br.fatec.produto;

public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private String salada;
    private String molho;

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String toString() {

        return "Pão: " + pao + ", carne: " + carne + ", queijo: " + queijo + ", salada: " + salada + ", molho: " + molho;

    }
}
