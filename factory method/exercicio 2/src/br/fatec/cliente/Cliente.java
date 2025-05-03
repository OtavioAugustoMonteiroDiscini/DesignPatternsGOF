package br.fatec.cliente;

import br.fatec.notificacao.Notificacao;
import br.fatec.notificacaofactory.EmailFactory;
import br.fatec.notificacaofactory.PushNotificationFactory;
import br.fatec.notificacaofactory.SMSFactory;

public class Cliente {
    public static void main(String[] args) {
        EmailFactory emailFactory = new EmailFactory();
        PushNotificationFactory pushNotificationFactory = new PushNotificationFactory();
        SMSFactory SMSFactory = new SMSFactory();

        Notificacao email = emailFactory.criarNotificacao();
        Notificacao pushNotification = pushNotificationFactory.criarNotificacao();
        Notificacao SMS = SMSFactory.criarNotificacao();

        email.enviarMensagem();
        pushNotification.enviarMensagem();
        SMS.enviarMensagem();
    }
}
