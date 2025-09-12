package designPatterns.factoryDesignPattern.abstractFactory.products.burger.normal.normalBurgers;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;

public class BasicBurger extends Burger {
    
    @Override
    public void prepare(){
        System.out.println("Here is your basic burger");
    }

}
