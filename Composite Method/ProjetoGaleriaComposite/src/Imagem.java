public class Imagem implements ElementoGaleria{
    private String nome;

    public Imagem(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem " + nome);
    }
}
