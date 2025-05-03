package br.fatec.projetoui.factory;

import br.fatec.projetoui.model.Button;
import br.fatec.projetoui.model.Window;

public interface UIFactory {
    Button createButton();
    Window createWindow();
}
