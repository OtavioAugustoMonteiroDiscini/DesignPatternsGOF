//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Arthas", "Espada", 10);

        // Clonando personagens
        Personagem clone1 = guerreiro.clone();
        Personagem clone2 = guerreiro.clone();

        // Modificando clones
        clone1.setNome("Lancelot");
        clone1.setNivel(12);

        clone2.setNome("Gawain");
        clone2.setPoder("Lança");

        // Exibindo
        System.out.println("Original:");
        guerreiro.mostrarStatus();

        System.out.println("\nClone 1:");
        clone1.mostrarStatus();

        System.out.println("\nClone 2:");
        clone2.mostrarStatus();
    }
}