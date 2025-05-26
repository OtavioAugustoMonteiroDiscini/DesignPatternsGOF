package br.fatec;

public class ScoreManager {
    private static final ScoreManager instance = new ScoreManager();
    private int pontuacaoAtual;

    private ScoreManager(){
        pontuacaoAtual = 0;
    }

    public static ScoreManager getInstance(){
    return instance;
    }
    public void adicionarPontos(int pontos){
        pontuacaoAtual = pontuacaoAtual + pontos;
    }

    public int getPontuacaoAtual() {
        return pontuacaoAtual;
    }

    public void setPontuacaoAtual(int pontuacaoAtual) {
        this.pontuacaoAtual = pontuacaoAtual;
    }
}
