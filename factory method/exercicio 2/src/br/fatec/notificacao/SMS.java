package br.fatec.notificacao;

public class SMS implements Notificacao{
    @Override
    public void enviarMensagem() {
        System.out.println("Notificação SMS");
    }
}
