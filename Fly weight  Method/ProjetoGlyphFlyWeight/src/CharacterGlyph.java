public class CharacterGlyph implements Glyph{

    private final char symbol;
    private final String font;
    private final int size;
    private final String style;

    public CharacterGlyph(char symbol, String font, int size, String style) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
        this.style = style;
    }

    public char getSymbol() {return symbol;}
    public String getFont() {return font;}
    public int getSize() {return size;}
    public String getStyle() {return style;}

    @Override
    public void render(int x, int y) {
        System.out.printf("Renderizando '%c' em (%d,%d) [font = %s, size=%d, style=%s]%n", symbol, x, y, font, size, style);


    }
}
