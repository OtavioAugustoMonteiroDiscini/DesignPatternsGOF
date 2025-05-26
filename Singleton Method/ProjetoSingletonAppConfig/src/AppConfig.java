public class AppConfig {
    private static final AppConfig instance = new AppConfig();
    private String ambiente = "desenvolvimento";
    private String apiBaseUrl = "www.google.com";
    private boolean modoDebug = true;

    private AppConfig(){
        System.out.println("Configurações carregadas...");
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public boolean isModoDebug() {
        return modoDebug;
    }

    public void setModoDebug(boolean modoDebug) {
        this.modoDebug = modoDebug;
    }

    public static AppConfig getInstance(){
        return instance;
    }

    public void exibirConfiguracoes(){
        System.out.println("Ambiente de :" + ambiente);
        System.out.println("URL: " + apiBaseUrl);
        System.out.println("Modo Debug: " + modoDebug);
    }

}
