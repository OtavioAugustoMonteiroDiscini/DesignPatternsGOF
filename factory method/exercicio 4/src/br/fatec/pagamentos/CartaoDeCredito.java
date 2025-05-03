package br.fatec.pagamentos;

public class CartaoDeCredito implements Pagamento{
    @Override
    public void ProcessarPagamento() {
        System.out.println("Opção de pagamento: Cartao de Credito");
    }
}
