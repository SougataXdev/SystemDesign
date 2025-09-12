package designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.normal.NormalGarlicBreads;

import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;

public class PremiumGarlicBread extends GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Here is your premium garlic bread");
    }
}
