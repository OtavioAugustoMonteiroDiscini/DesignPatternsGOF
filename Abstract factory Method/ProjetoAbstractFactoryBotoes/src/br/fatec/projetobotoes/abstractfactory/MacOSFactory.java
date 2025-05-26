package br.fatec.projetobotoes.abstractfactory;

import br.fatec.projetobotoes.model.Button;
import br.fatec.projetobotoes.model.MacOSButton;

public class MacOSFactory implements GUIAbstractFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
