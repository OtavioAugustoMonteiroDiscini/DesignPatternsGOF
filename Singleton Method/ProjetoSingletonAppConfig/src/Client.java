public class Client {
    public static void main(String[] args) {
    AppConfig config = AppConfig.getInstance();
    config.exibirConfiguracoes();

    config.setAmbiente("produção");
    config.setApiBaseUrl("www.teams.com");
    config.setModoDebug(false);

    System.out.println("\n Configurações modificadas");
    config.exibirConfiguracoes();

    AppConfig config2 = AppConfig.getInstance();
    System.out.println("Acessando configs no navegador");
    config2.exibirConfiguracoes();

    }
}
