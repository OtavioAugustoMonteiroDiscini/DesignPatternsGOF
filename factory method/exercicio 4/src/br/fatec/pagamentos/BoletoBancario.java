package br.fatec.pagamentos;

public class BoletoBancario implements Pagamento{
    @Override
    public void ProcessarPagamento() {
        System.out.println("Opção de pagamento: Boleto Bancario");
    }
}
