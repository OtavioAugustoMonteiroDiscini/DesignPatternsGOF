package br.fatec.notificacao;

public class Email implements Notificacao{
    @Override
    public void enviarMensagem() {
        System.out.println("Notificação E-Mail");
    }
}
