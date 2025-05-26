package br.fatec;

public class Client {
    public static void main(String[] args) {
        ScoreManager pontuacao =ScoreManager.getInstance();
        pontuacao.setPontuacaoAtual(15);
        pontuacao.adicionarPontos(1);

        System.out.println("Pontuação atual é de:" + pontuacao.getPontuacaoAtual());

        ScoreManager pontuacao2 = ScoreManager.getInstance();

        System.out.println(pontuacao2.getPontuacaoAtual());
    }
}
