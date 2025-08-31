public class ImpressoraJatoTinta implements Impressora{
    @Override
    public void imprimir(String texto) {
        System.out.println("[Jato de Tinta] " + texto);
    }
}
