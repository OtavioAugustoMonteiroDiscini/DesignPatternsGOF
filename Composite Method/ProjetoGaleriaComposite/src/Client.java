
public class Client {
    public static void main(String[] args) {
        // Criando imagens
        Imagem img1 = new Imagem("Foto1.png");
        Imagem img2 = new Imagem("Foto2.png");
        Imagem img3 = new Imagem("Foto3.png");

        // Criando álbuns
        Album album1 = new Album("Viagem");
        Album album2 = new Album("Família");

        // Adicionando imagens nos álbuns
        album1.adicionar(img1);
        album1.adicionar(img2);

        album2.adicionar(img3);
        album2.adicionar(album1); // álbum dentro de álbum

        // Exibindo
        album2.exibir();
    }
}