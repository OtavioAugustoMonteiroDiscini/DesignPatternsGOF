package br.fatec.linhaponto;

public class Linha implements Desenhavel{

    private Ponto pontoInicial;
    private Ponto pontoFinal;

    public Linha(Ponto pontoInicial, Ponto pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public void setPontoInicial(Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    @Override
    public Linha clone() {
        try {
            Ponto novoPontoInicial = pontoInicial.clone();
            Ponto novoPontoFinal = pontoFinal.clone();

            Linha novaLinha = (Linha) super.clone();
            novaLinha.setPontoInicial(novoPontoInicial);
            novaLinha.setPontoFinal(novoPontoFinal);
            return novaLinha;
        }catch (CloneNotSupportedException e){
            System.err.println("Erro ao clonar a linha: " + e.getMessage());
            return null;

        }
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando uma linha de " + this.pontoFinal + " ate " + this.pontoFinal);
    }
}
