package br.fatec;

public class GameSettings {
    private static final GameSettings instance = new GameSettings();

    private int volume = 50;
    private String dificuldade = "Normal";
    private boolean fullscreen = true;
    private String idioma = "PT-BT";
    private int resolucaoX = 1440;
    private int resolucaoY = 900;

    private GameSettings(){
        System.out.println("Configurações iniciais carregadas.");
            }

    public static GameSettings getInstance(){
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getResolucaoX() {
        return resolucaoX;
    }

    public void setResolucao(int resolucaoX, int resolucaoY) {
        this.resolucaoX = resolucaoX;
        this.resolucaoY = resolucaoY;
    }

    public int getResolucaoY() {
        return resolucaoY;
    }

    public void exibirConfiguracoes(){
        System.out.println("==== CONFIGURAÇÕES DO JOGO ====");
        System.out.println("Volume: " + volume);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Telacheia: " + fullscreen);
        System.out.println("Idioma: " + idioma);
        System.out.println("Resolucao" + resolucaoX + "x" + resolucaoY);

    }
}
