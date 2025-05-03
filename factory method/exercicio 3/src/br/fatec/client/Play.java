package br.fatec.client;

import br.fatec.criadordepersonagens.Personagem;
import br.fatec.factory.CharFactory;
import br.fatec.factory.PersonagemFactory;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemFactory fabrica = new CharFactory();
        System.out.println("## Escolha a classe do personagem ##");
        System.out.println("G = Guerreiro");
        System.out.println("M = Mago");
        System.out.println("A = Arqueiro");
        String escolha = sc.nextLine();

        Personagem personagem = fabrica.criarPersonagem(escolha);
        personagem.exibirHabilidades();

    }
}
