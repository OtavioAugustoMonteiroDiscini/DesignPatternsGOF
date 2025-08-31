public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia; // referência única

    private boolean modoEscuro;
    private String idioma;

    // Construtor privado -> impede criação fora da classe
    private ConfiguracaoSistema() {
        this.modoEscuro = false;
        this.idioma = "pt-BR";
    }

    // Ponto de acesso global (lazy initialization)
    public static ConfiguracaoSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    // Métodos de configuração
    public void setModoEscuro(boolean modoEscuro) {
        this.modoEscuro = modoEscuro;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void mostrarConfiguracao() {
        System.out.println("Modo Escuro: " + (modoEscuro ? "Ativado" : "Desativado"));
        System.out.println("Idioma: " + idioma);
    }
}
