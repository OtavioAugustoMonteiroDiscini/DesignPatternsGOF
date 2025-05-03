package br.fatec.projetobotoes.abstractfactory;

import br.fatec.projetobotoes.model.Button;
import br.fatec.projetobotoes.model.WindowsButton;

public class WindowsFactory implements GUIAbstractFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
