package designPatterns.factoryDesignPattern.simpleFactory;

public class Factory {

    public static Burger burgerOrder(BurgerType burgerType) {

        if (burgerType == BurgerType.STANDARD) {
            Burger burger = new StandardBurger();
            return burger;
        } else if (burgerType == BurgerType.PREMIUM) {
            Burger burger = new PremiumBurger();
            return burger;
        } else {
            Burger burger = new SimpleBurger();
            return burger;
        }
    }
}
