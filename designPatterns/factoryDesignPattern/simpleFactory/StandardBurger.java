package designPatterns.factoryDesignPattern.simpleFactory;

public class StandardBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Here is your standard burger");
    }
}
