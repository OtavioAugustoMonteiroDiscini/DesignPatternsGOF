public class Chocolate extends BebidaDecorator{

    public Chocolate(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.0;
    }
}
