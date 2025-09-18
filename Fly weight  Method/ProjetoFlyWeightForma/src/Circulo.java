public class Circulo implements Forma{
    private String cor;

    public Circulo(String cor) {
        this.cor = cor;
    }

    @Override
    public void desenhar(int x, int y) {
        System.out.println("Circulo de cor " + cor + " senhado em ("+ x + "," + y + ")");
    }
}
