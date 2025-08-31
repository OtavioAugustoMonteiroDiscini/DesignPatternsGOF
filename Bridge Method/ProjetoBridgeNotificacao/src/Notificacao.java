public abstract class Notificacao {
    protected CanalEnvio canal;
    protected String destino;

    public Notificacao(CanalEnvio canal, String destino){
        this.canal = canal;
        this.destino = destino;
    }

    public abstract void enviar();
}
