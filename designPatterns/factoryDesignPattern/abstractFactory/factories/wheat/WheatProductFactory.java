package designPatterns.factoryDesignPattern.abstractFactory.factories.wheat;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;
import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.factories.ProductFactory;
import designPatterns.factoryDesignPattern.abstractFactory.products.burger.wheat.wheatBurgers.BasicWheatBurger;
import designPatterns.factoryDesignPattern.abstractFactory.products.burger.wheat.wheatBurgers.PremiumWheatBurger;
import designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.wheat.wheatGarlicBreads.BasicWheatGarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.wheat.wheatGarlicBreads.PremiumWheatGarlicBread;

public class WheatProductFactory implements ProductFactory {

	@Override
	public Burger createBasicBurger() {
		return new BasicWheatBurger();
	}

	@Override
	public Burger createPremiumBurger() {
		return new PremiumWheatBurger();
	}

	@Override
	public GarlicBread createBasicGarlicBread() {
		return new BasicWheatGarlicBread();
	}

	@Override
	public GarlicBread createPremiumGarlicBread() {
		return new PremiumWheatGarlicBread();
	}
}
