package br.fatec.produto;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String SistemaOperacional;

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        SistemaOperacional = sistemaOperacional;
    }

    public String toString(){
        return "\nProcessador: " + processador
                + "\nMemoriaRAM: " + memoriaRAM
                + "\nArmazenamento: " + armazenamento
                + "\nPlacaVideo: " + placaVideo
                + "\nSistemaOperacional: " + SistemaOperacional;
    }
}
