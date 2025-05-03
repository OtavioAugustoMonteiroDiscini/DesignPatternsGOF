package br.fatec.projetoui.factory;

import br.fatec.projetoui.model.Button;
import br.fatec.projetoui.model.DarkButton;
import br.fatec.projetoui.model.DarkWindow;
import br.fatec.projetoui.model.Window;

public class DarkUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Window createWindow() {
        return new DarkWindow();
    }
}
