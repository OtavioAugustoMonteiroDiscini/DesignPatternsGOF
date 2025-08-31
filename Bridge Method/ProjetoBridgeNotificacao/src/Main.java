//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Implementacoes concretas
        CanalEnvio email = new Email();
        CanalEnvio sms = new SMS();
        CanalEnvio push = new PushNotification();

        Notificacao alerta = new Alerta(sms, "11999999");
        Notificacao promo = new Promocao(email, "cliente@cliente.com");
        Notificacao informe = new Informe(push, "userApp123");

        alerta.enviar();
        promo.enviar();
        informe.enviar();
    }
}