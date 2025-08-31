public class Promocao extends Notificacao{
    public Promocao(CanalEnvio canal, String destino) {
        super(canal, destino);
    }

    @Override
    public void enviar() {
    String mensagem = "PROMOCAO: Descontos incriveis disponiveis agora";
    canal.enviar(destino, mensagem);
    }
}
