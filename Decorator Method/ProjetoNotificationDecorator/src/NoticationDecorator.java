public class NoticationDecorator implements Notification{

    protected Notification wrapper;

    public NoticationDecorator(Notification wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void enviar(String mensagem) {
        wrapper.enviar(mensagem);
    }
}
