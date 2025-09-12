package designPatterns.factoryDesignPattern.abstractFactory.products.burger.wheat.wheatBurgers;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;

public class PremiumWheatBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Here is your basic wheat burger");
    }
}
