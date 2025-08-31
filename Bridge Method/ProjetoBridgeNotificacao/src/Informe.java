public class Informe extends Notificacao{
    public Informe(CanalEnvio canal, String destino) {
        super(canal, destino);
    }

    @Override
    public void enviar() {
        String mensagem = "INFORME: Sua conta foi att com sucesso";
        canal.enviar(destino, mensagem);
    }
}
