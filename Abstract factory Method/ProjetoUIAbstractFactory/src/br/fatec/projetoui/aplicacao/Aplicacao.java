package br.fatec.projetoui.aplicacao;


import br.fatec.projetoui.cliente.Cliente;
import br.fatec.projetoui.factory.DarkUIFactory;
import br.fatec.projetoui.factory.LigthUIFactory;
import br.fatec.projetoui.factory.UIFactory;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        UIFactory factory;

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        System.out.println("## Escolha uma das opções abaixo ##");
        System.out.println("Opção 1: Tema escuro");
        System.out.println("Opção 2: Tema claro");
        System.out.print("Digite aqui sua opção: ");
        opcao = Integer.parseInt(sc.nextLine());

        if(opcao == 1 ){
            factory = new DarkUIFactory();
            Cliente.renderUI(factory);
        } else if (opcao == 2) {
            factory = new LigthUIFactory();
            Cliente.renderUI(factory);
        }else {
            System.out.println("Opção invalida");
        }



    }
}