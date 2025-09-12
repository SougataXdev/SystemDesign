package designPatterns.factoryDesignPattern.simpleFactory;

public class Main {
    
    public static void main(String[] args) {
        Factory.burgerOrder(BurgerType.SIMPLE).prepare();
        Factory.burgerOrder(BurgerType.PREMIUM).prepare();
    }
}
