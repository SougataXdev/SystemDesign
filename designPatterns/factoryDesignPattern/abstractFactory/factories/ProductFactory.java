package designPatterns.factoryDesignPattern.abstractFactory.factories;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;
import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;

public interface ProductFactory {
    Burger createBasicBurger();
    Burger createPremiumBurger();
    GarlicBread createBasicGarlicBread();
    GarlicBread createPremiumGarlicBread();
}
