public class Client {
    public static void main(String[] args) {
        Impressora jato = new ImpressoraJatoTinta();
        Impressora laser = new ImpressoraLaser();

        ServicoDeImpressao rapidaJato = new ImpressaoRapida(jato);
        ServicoDeImpressao detalhadaLaser = new ImpressaoDetalhada(laser);

        rapidaJato.executarImpressao("Relatório mensal");
        detalhadaLaser.executarImpressao("Relatório anual com gráficos");
    }
}