public class FacebookNotificator extends NoticationDecorator{
    public FacebookNotificator(Notification wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando FACEBOOK: " + mensagem);
    }
}
