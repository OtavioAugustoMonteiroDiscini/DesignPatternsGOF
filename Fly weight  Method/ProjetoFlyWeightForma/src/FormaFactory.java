import java.util.HashMap;
import java.util.Map;

public class FormaFactory {

//    1. Estrutura de armazenamento: cache de objetos já criados
    private static final Map<String, Forma> formas = new HashMap<>();

//    2. Metódo de acesso: devolve objeto existente ou cria um novo
    public static  Forma getCirculo(String cor){
        //tenta buscar no cache
        Forma circulo = formas.get(cor);

        if(circulo == null){
            circulo = new Circulo(cor);
            formas.put(cor, circulo);
            System.out.println("Novo circulo criado na cor: " + cor);
                    }
        return circulo;
    }
}
