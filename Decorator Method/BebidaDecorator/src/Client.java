public class Client {
    public static void main(String[] args) {
        //Quando cria um new Cafe ele tem um custo fixo de 3;
        Bebida pedido = new Cafe();


        pedido = new Leite(pedido);
        //O leite recebe dentro dele um cafe, quando o cliente chama pedido.custo o leite custo chama internamente o cafesimples.custo e adiciona o valor do leite

        pedido = new Chocolate(pedido);
        //chama o café simples custo que chama o leite


        System.out.println(pedido.getDescricao() + " custa R$ " + pedido.getCusto());

    }
}