package designPatterns.factoryDesignPattern.abstractFactory.app.shops;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;
import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.factories.ProductFactory;

public class McDonaldsShop {
    private final ProductFactory factory;

    public McDonaldsShop(ProductFactory factory) {
        this.factory = factory;
    }

    public void serveCombo() {
        Burger burger = factory.createBasicBurger();
        GarlicBread gb = factory.createPremiumGarlicBread();
        burger.prepare();
        gb.prepare();
    }
}
