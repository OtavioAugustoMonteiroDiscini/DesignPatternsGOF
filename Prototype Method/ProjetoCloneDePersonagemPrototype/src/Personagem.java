class Personagem implements Cloneable{
    private String nome;
    private String poder;
    private int nivel;

    public Personagem(String nome, String poder, int nivel) {
        this.nome = nome;
        this.poder = poder;
        this.nivel = nivel;
    }

    // Método de clonagem
    @Override
    public Personagem clone() {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar personagem", e);
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome + ", Poder: " + poder + ", Nível: " + nivel);
    }

    // Getters e Setters (caso queira mudar atributos do clone depois)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

