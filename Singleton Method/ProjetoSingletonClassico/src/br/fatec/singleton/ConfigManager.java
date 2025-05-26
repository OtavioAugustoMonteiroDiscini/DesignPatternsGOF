package br.fatec.singleton;

public class ConfigManager {
    private static ConfigManager instance;

    //Privado para evitar instancia externa
    private ConfigManager() {
        System.out.println("Carregando configurações...");
    }

    public static ConfigManager getInstance(){
        if (instance == null){
            instance = new ConfigManager();
        }
        return  instance;
    }

    public void mostrarConfiguraçoes(String msg){
        System.out.println("Exibindo configurações do sistema. \n" + msg);
    }
}
