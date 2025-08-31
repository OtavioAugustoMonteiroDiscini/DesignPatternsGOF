public class Email implements CanalEnvio{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando email para " + destino + ":" + mensagem);
    }
}
