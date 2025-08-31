public abstract class MessageDecorator implements Message {

    protected Message mensagem;

    public MessageDecorator(Message mensagem) {
        this.mensagem = mensagem;
    }
}
