//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {

        Message msg = new SimpleMessage("Hello World!");
        msg = new MessageCriptograph(msg);
        msg = new MessageWithHTML(msg);


        System.out.println(msg.formatar());
        }
    }
