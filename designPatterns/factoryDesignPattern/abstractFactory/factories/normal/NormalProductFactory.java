package designPatterns.factoryDesignPattern.abstractFactory.factories.normal;

import designPatterns.factoryDesignPattern.abstractFactory.api.Burger;
import designPatterns.factoryDesignPattern.abstractFactory.api.GarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.factories.ProductFactory;
import designPatterns.factoryDesignPattern.abstractFactory.products.burger.normal.normalBurgers.BasicBurger;
import designPatterns.factoryDesignPattern.abstractFactory.products.burger.normal.normalBurgers.PremiumBurger;
import designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.normal.NormalGarlicBreads.BasicGarlicBread;
import designPatterns.factoryDesignPattern.abstractFactory.products.garlicbread.normal.NormalGarlicBreads.PremiumGarlicBread;

public class NormalProductFactory implements ProductFactory {

	@Override
	public Burger createBasicBurger() {
		return new BasicBurger();
	}

	@Override
	public Burger createPremiumBurger() {
		return new PremiumBurger();
	}

	@Override
	public GarlicBread createBasicGarlicBread() {
		return new BasicGarlicBread();
	}

	@Override
	public GarlicBread createPremiumGarlicBread() {
		return new PremiumGarlicBread();
	}
}
