package designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.wheat.wheatGarlicBreads;

import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;

public class BasicWheatGarlicBread extends GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Here is your basic wheat Garlic bread ");
    }
}
