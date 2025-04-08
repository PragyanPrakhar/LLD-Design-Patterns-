package DecoratorDesignPattern.Text_Formatting;

public class TextEditor {
    public static void main(String[] args) {
        Text myText = new PlainText("Hello, Pragyan!");
        
        // Apply bold and italic
        myText = new BoldText(myText);
        myText = new ItalicText(myText);
        myText = new UnderlineText(myText);

        System.out.println("Formatted Output: " + myText.render());
    }
}
