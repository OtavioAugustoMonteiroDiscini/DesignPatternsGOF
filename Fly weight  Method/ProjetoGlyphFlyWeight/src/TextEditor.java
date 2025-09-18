import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private final GlyphFactory glyphFactory;
    private final List<LetterEntry> letters = new ArrayList<>();

    public TextEditor(GlyphFactory glyphFactory) {
        this.glyphFactory = glyphFactory;
    }

    public void addLetter(char symbol, String font, int size, String style, int x, int y){
        letters.add(new LetterEntry(symbol, font, size, style, x, y));
    }

    public void renderText(){
        for(LetterEntry entry : letters){
            Glyph glyph = glyphFactory.getGlyph(entry.symbol, entry.font, entry.size, entry.style);
            glyph.render(entry.x, entry.y);
        }
    }
}
