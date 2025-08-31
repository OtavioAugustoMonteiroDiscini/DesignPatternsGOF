//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Pegando a instância global
        ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstance();
        config1.setModoEscuro(true);
        config1.setIdioma("en-US");

        // Pegando outra "instância"
        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstance();

        // Deve mostrar as mesmas configs (mesma instância!)
        config2.mostrarConfiguracao();

        // Verificando se é o mesmo objeto
        System.out.println("Mesma instância? " + (config1 == config2));
    }
}