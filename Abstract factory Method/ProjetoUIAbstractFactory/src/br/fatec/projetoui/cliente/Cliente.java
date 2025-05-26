package br.fatec.projetoui.cliente;

import br.fatec.projetoui.factory.UIFactory;
import br.fatec.projetoui.model.Button;
import br.fatec.projetoui.model.Window;

public class Cliente {

    public static void renderUI(UIFactory factory){
        Button button = factory.createButton();
        Window window = factory.createWindow();

        System.out.println(button.renderB());
        System.out.println(window.renderW());

    }
}
