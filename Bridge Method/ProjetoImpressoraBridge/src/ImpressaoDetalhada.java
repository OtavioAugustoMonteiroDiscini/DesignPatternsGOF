public class ImpressaoDetalhada extends ServicoDeImpressao{
    public ImpressaoDetalhada(Impressora impressora) {
        super(impressora);
    }

    @Override
    public void executarImpressao(String texto) {
        impressora.imprimir("Impressão detalhada:\n----\n" + texto + "\n----");
    }
}
