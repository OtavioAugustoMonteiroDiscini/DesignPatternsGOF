public class SimpleMessage implements Message {
    private String texto;

    public SimpleMessage(String texto) {
        this.texto = texto;
    }

    @Override
    public String formatar() {
        return texto;
    }
}
