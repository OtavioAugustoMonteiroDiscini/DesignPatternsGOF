public class Client {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        TextEditor editor = new TextEditor(factory);

        editor.addLetter('o', "Arial", 12, "normal", 10, 10);
        editor.addLetter('H', "Arial", 12, "normal", 20, 70);
        editor.addLetter('O', "Arial", 12, "normal", 30, 50);
        editor.addLetter(' ', "Arial", 12, "normal", 50, 30);
        editor.addLetter('1', "Arial", 12, "normal", 10, 20);

        editor.renderText();
        

    }
}