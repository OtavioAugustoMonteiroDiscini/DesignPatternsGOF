import br.fatec.singleton.ConfigManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.mostrarConfiguraçoes("Config 1");

        ConfigManager outraConfig = ConfigManager.getInstance();
        outraConfig.mostrarConfiguraçoes("Config 2");

        System.out.println("Mesma instancia? " + (config == outraConfig));

    }
}