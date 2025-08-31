public class ImpressaoRapida extends ServicoDeImpressao{
    public ImpressaoRapida(Impressora impressora) {
        super(impressora);
    }

    @Override
    public void executarImpressao(String texto) {
        impressora.imprimir("Impressão rápida: " + texto.toUpperCase());
    }
}
