package br.fatec.factory;

import br.fatec.pagamentos.BoletoBancario;
import br.fatec.pagamentos.Pagamento;

public class BoletoBancarioFactory implements PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new BoletoBancario();
    }
}
