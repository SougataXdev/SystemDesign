package designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.wheat.wheatGarlicBreads;

import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;

public class PremiumWheatGarlicBread extends GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Here is your premium Wheat garlic bread");
    }
}
