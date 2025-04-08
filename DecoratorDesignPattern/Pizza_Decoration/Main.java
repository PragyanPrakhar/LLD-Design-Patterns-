package DecoratorDesignPattern.Pizza_Decoration;
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Cost of margherita with the extra cheese and mushroom is:-> " + pizza.cost());
    }
}
