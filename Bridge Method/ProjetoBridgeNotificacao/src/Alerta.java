public class Alerta extends Notificacao{
    public Alerta(CanalEnvio canal, String destino) {
        super(canal, destino);
    }

    @Override
    public void enviar() {
        String mensagem = "ALERTA: Verifique o sistema imediatmente!";
        canal.enviar(destino, mensagem);
    }


}
