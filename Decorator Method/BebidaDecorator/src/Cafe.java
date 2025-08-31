public class Cafe implements Bebida{
    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getCusto() {
        return 3.0;
    }
}
