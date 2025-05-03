package br.fatec.notificacaofactory;

import br.fatec.notificacao.Email;
import br.fatec.notificacao.Notificacao;

public class EmailFactory implements NotificacaoFactory {

    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}
