package br.fatec.projetobotoes.aplicacao;

import br.fatec.projetobotoes.abstractfactory.GUIAbstractFactory;
import br.fatec.projetobotoes.abstractfactory.MacOSFactory;
import br.fatec.projetobotoes.abstractfactory.WindowsFactory;
import br.fatec.projetobotoes.cliente.Cliente;

public class Aplicacao {
    public static void main(String[] args) {
        GUIAbstractFactory factory;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            factory = new WindowsFactory();
        }else {
            factory = new MacOSFactory();
        }
        Cliente app = new Cliente(factory);
        app.render();
    }
}
