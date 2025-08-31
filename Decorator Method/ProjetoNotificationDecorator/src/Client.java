//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Notification notification = new EmailNotificator();

        notification = new SMSNotificator(notification);

        notification = new SlackNotificator(notification);

        notification = new FacebookNotificator(notification);

        notification.enviar("Servidor fora do ar");
    }
}