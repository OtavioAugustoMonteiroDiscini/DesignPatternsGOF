public class MessageWithHTML extends MessageDecorator{

    public MessageWithHTML(Message message){
        super(message);
    }

    @Override
    public String formatar() {
        return " <html><body> " + mensagem.formatar() + " </html></body> " ;
    }
}
