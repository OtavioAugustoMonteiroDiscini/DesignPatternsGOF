public class SMSNotificator extends NoticationDecorator{
    public SMSNotificator(Notification wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
