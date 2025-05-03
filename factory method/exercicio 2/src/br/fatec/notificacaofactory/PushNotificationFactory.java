package br.fatec.notificacaofactory;

import br.fatec.notificacao.Notificacao;

import br.fatec.notificacao.SMS;

public class PushNotificationFactory implements NotificacaoFactory{
    @Override
    public Notificacao criarNotificacao() {
        return new SMS();
    }
}
