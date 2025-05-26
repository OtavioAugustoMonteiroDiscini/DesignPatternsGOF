package br.fatec;

public class Cliente {
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();
        settings.exibirConfiguracoes();

        settings.setVolume(80);
        settings.setDificuldade("Dificil");
        settings.setIdioma("en-US");
        settings.setFullscreen(false);
        settings.setResolucao(1280, 720);

        System.out.println("\n Configurações modificadas: ");
        settings.exibirConfiguracoes();

        GameSettings gameplaySettings = GameSettings.getInstance();
        System.out.println("\n Acessando configurações (gameplaySettings) durante o jogo");
        gameplaySettings.exibirConfiguracoes();

    }
}