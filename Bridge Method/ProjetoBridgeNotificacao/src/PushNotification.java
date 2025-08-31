public class PushNotification implements CanalEnvio{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando Push para " + destino + ":" + mensagem);
    }
}
