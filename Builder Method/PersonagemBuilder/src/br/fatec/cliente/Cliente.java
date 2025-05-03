package br.fatec.cliente;

import br.fatec.builder.BuilderGuerreiro;
import br.fatec.builder.BuilderMago;
import br.fatec.builder.PersonagemBuilder;
import br.fatec.diretor.Diretor;
import br.fatec.produto.Personagem;

public class Cliente {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        PersonagemBuilder guerreiro = new BuilderGuerreiro();
        diretor.setBuilder(guerreiro);
        Personagem personagem = diretor.build();
        System.out.println(personagem);

        PersonagemBuilder mago = new BuilderMago();
        diretor.setBuilder(mago);
        personagem = diretor.build();
        System.out.println(personagem);
    }
}
