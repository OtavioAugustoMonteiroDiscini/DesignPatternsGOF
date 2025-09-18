import java.text.Normalizer;

public class Client {
    public static void main(String[] args) {
        Forma red1 = FormaFactory.getCirculo("Vermelho");
        red1.desenhar(10,20);

        Forma blue1 = FormaFactory.getCirculo("Azul");
        blue1.desenhar(30, 40);

        Forma red2 = FormaFactory.getCirculo("Vermelho.");
        red2.desenhar(50, 60);

        System.out.println("Os circulos são iguais?");
        System.out.println(red1 == red2);
        System.out.println(blue1 == red2);
    }
}