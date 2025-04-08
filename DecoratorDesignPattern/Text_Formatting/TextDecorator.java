package DecoratorDesignPattern.Text_Formatting;

public abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    public abstract String render();
}
