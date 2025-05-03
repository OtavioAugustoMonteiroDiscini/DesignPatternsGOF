package br.fatec.cliente;

import br.fatec.factory.BoletoBancarioFactory;
import br.fatec.factory.CartaoDeCreditoFactory;
import br.fatec.factory.PixFactory;
import br.fatec.pagamentos.BoletoBancario;
import br.fatec.pagamentos.CartaoDeCredito;
import br.fatec.pagamentos.Pagamento;

public class Client {
    public static void main(String[] args) {
        BoletoBancarioFactory boletoBancarioFactory = new BoletoBancarioFactory();
        CartaoDeCreditoFactory cartaoDeCreditoFactory = new CartaoDeCreditoFactory();
        PixFactory pixFactory = new PixFactory();

        Pagamento cartaoDeCredito = cartaoDeCreditoFactory.criarPagamento();
        Pagamento pix = pixFactory.criarPagamento();
        Pagamento boletoBancario = boletoBancarioFactory.criarPagamento();

        cartaoDeCredito.ProcessarPagamento();
        pix.ProcessarPagamento();
        boletoBancario.ProcessarPagamento();

    }
}
