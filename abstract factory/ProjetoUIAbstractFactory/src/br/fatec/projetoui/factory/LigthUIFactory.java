package br.fatec.projetoui.factory;

import br.fatec.projetoui.model.Button;
import br.fatec.projetoui.model.LightButton;
import br.fatec.projetoui.model.LightWindow;
import br.fatec.projetoui.model.Window;

public class LigthUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Window createWindow() {
        return new LightWindow();
    }
}
