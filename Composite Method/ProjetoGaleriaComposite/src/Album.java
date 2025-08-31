public class Album implements ElementoGaleria{
    private String nome;
    private List<ElementoGaleria> elementos = new ArrayList<>();

    public Album(String nome) {
        this.nome = nome;
    }

    public void adicionar(ElementoGaleria elemento) {
        elementos.add(elemento);
    }

    public void remover(ElementoGaleria elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void exibir() {
        System.out.println("Álbum: " + nome);
        for (ElementoGaleria elemento : elementos) {
            elemento.exibir();
        }
    }
}
