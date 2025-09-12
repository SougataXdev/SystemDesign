package designPatterns.factoryDesignPattern.simpleFactory;

public class PremiumBurger extends Burger{
    @Override 
    public void prepare(){
        System.out.println("Here is your premium burger");
    }
}
