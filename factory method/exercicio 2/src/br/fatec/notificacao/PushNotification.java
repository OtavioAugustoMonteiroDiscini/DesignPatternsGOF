package br.fatec.notificacao;

public class PushNotification implements Notificacao{

    @Override
    public void enviarMensagem() {
        System.out.println("Push Notification");
    }
}
