public class Client {
    public static void main(String[] args) {
        ComputadorBuilder builder = new ComputadorBuilderSimples();
        DiretorMontagem diretor = new DiretorMontagem();

        // Montando um computador gamer
        Computador pcGamer = diretor.montarGamer(builder);

        // Exibindo configuração
        pcGamer.mostrarConfiguracao();

        System.out.println("\n--- Montagem Manual ---");

        // Também dá pra montar manualmente sem o diretor
        Computador pcBasico = builder
                .setCpu("Intel Core i5")
                .setRam("8GB DDR4")
                .setArmazenamento("500GB SSD")
                .setGpu("Integrada")
                .build();

        pcBasico.mostrarConfiguracao();
    }
}