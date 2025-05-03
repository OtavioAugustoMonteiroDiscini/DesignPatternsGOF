package br.fatec.projetobotoes.cliente;

import br.fatec.projetobotoes.abstractfactory.GUIAbstractFactory;
import br.fatec.projetobotoes.model.Button;

public class Cliente {
    private Button button;

    public Cliente(GUIAbstractFactory factory){
        this.button = factory.createButton();
    }

    public void render() {
        this.button.render();
    }
}
