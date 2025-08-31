abstract class ServicoDeImpressao {
    protected Impressora impressora;

    public ServicoDeImpressao(Impressora impressora) {
        this.impressora = impressora;
    }

    public abstract void executarImpressao(String texto);
}