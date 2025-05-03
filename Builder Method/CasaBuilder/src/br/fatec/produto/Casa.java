package br.fatec.produto;

public class Casa {

    private String estrutura;
    private String telhado;
    private String interior;

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString(){
        return "======== Casa de " + this.estrutura + " ======== " +
                "\nTelhado: " + this.telhado +
                "\nInterior: " + this.interior;
    }

}
