package designPatterns.factoryDesignPattern.abstractFactory.products.burger.normal.normalBurgers;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;

public class PremiumBurger extends Burger {
    @Override
    public  void prepare(){
    System.out.println("Here is your premium burger");
    }
}
