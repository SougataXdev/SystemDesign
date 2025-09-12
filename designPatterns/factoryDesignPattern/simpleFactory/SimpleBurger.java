package designPatterns.factoryDesignPattern.simpleFactory;

public class SimpleBurger extends Burger {
    @Override 
    public void prepare(){
        System.out.println("Here is your simple burger");
    }
}
