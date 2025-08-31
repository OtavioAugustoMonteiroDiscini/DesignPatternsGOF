package br.fatec.linhaponto;

public class Cliente {
    public static void main(String[] args) {
        Ponto inicial = new Ponto(10, 20);
        Ponto finalP = new Ponto(30,40);
        Linha protipoLinha = new Linha(inicial, finalP);

        System.out.println("Prototipo de Linha: ");
        protipoLinha.desenhar();


        Linha linhaClonada1 = protipoLinha.clone();
        System.out.println("\nPrimeira Linha Clonada: ");
        linhaClonada1.desenhar();


        Linha linhaClonada2 = protipoLinha.clone();
        System.out.println("\nSegunda Linha Clonada: ");
        linhaClonada2.desenhar();


        if(linhaClonada1 != null){
            linhaClonada1.getPontoFinal().setX(50);
            linhaClonada1.getPontoFinal().setY(60);
            System.out.println("\nPrimeira Linha Clonada MODIFICADA: ");
            linhaClonada1.desenhar();
        }


        System.out.println("\n Prototipo da Linha(inalterado): ");
        protipoLinha.desenhar();

        System.out.println("\nSegunda Linha Clonada(inalterada): ");
        linhaClonada2.desenhar();
    }
}
