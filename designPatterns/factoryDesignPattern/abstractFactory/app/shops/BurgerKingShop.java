package designPatterns.factoryDesignPattern.abstractFactory.app.shops;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;
import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.factories.ProductFactory;

public class BurgerKingShop {
    private final ProductFactory factory;

    public BurgerKingShop(ProductFactory factory) {
        this.factory = factory;
    }

    public void serveCombo() {
        Burger burger = factory.createPremiumBurger();
        GarlicBread gb = factory.createBasicGarlicBread();
        burger.prepare();
        gb.prepare();
    }
}
