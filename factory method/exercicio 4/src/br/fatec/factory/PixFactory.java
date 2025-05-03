package br.fatec.factory;

import br.fatec.pagamentos.Pagamento;
import br.fatec.pagamentos.Pix;

public class PixFactory implements PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
