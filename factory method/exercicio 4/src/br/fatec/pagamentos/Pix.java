package br.fatec.pagamentos;

public class Pix implements Pagamento{
    @Override
    public void ProcessarPagamento() {
        System.out.println("Opção de pagamento: PIX");
    }
}
