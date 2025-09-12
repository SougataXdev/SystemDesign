package designPatterns.factoryDesignPattern.abstractFactory.app;

import designPatterns.factoryDesignPattern.abstractFactory.app.shops.BurgerKingShop;
import designPatterns.factoryDesignPattern.abstractFactory.app.shops.McDonaldsShop;
import designPatterns.factoryDesignPattern.abstractFactory.factories.ProductFactory;
import designPatterns.factoryDesignPattern.abstractFactory.factories.normal.NormalProductFactory;
import designPatterns.factoryDesignPattern.abstractFactory.factories.wheat.WheatProductFactory;

public class Main {
	public static void main(String[] args) {
		
		ProductFactory normalFactory = new NormalProductFactory();
		ProductFactory wheatFactory = new WheatProductFactory();


		BurgerKingShop bkNormal = new BurgerKingShop(normalFactory);
		McDonaldsShop mcWheat = new McDonaldsShop(wheatFactory);

		System.out.println("Burger King serving (normal family):");
		bkNormal.serveCombo();

		System.out.println("McDonald's serving (wheat family):");
		mcWheat.serveCombo();
	}
}
