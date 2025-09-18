import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private final Map<String, Glyph>pool = new HashMap<>();

    private String makeKey(char symbol, String font, int size, String style){
        return symbol + "|" + font + "|" + size + "|" + style;
    }

    public Glyph getGlyph(char symbol, String font, int size, String style){
        String key = makeKey(symbol, font, size, style);
        Glyph glyph = pool.get(key);
        if(glyph == null){
            glyph = new CharacterGlyph(symbol, font, size, style);
            pool.put(key, glyph);
            System.out.printf("Criando novo CharacterGlyph para key: %s%n", key);
        }
        return glyph;
    }

    public int getPoolSize(){
        return pool.size();
    }
}
