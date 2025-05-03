package br.fatec.factory;

import br.fatec.pagamentos.CartaoDeCredito;
import br.fatec.pagamentos.Pagamento;

public class CartaoDeCreditoFactory implements PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new CartaoDeCredito();
    }
}
