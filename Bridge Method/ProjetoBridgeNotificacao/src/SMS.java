public class SMS implements CanalEnvio{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para" + destino + ":" + mensagem);
    }
}
