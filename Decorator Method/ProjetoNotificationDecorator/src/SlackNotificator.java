public class SlackNotificator extends NoticationDecorator{
    public SlackNotificator(Notification wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando SLACK: " + mensagem);
    }
}
