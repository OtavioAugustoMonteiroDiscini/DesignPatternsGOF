public class MessageCriptograph extends MessageDecorator{

    public MessageCriptograph(Message mensagem) {
        super(mensagem);
    }

    @Override
    public String formatar() {
        return new StringBuilder(mensagem.formatar()).reverse().toString();
    }
}
