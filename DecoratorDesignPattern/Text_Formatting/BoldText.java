package DecoratorDesignPattern.Text_Formatting;

public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<b>" + text.render() + "</b>";
    }
}

