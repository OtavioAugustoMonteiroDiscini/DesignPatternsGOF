public class ImpressoraLaser implements Impressora{
    @Override
    public void imprimir(String texto) {
        System.out.println("[Laser] " + texto);
    }
}
