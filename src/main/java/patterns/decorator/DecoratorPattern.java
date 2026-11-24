package patterns.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage beverage = new Milk(new Espresso());
        beverage = new AlmondMilk(beverage);
        beverage = new GoatMilk(beverage);
        System.out.println("Coffee Name : " + beverage.getDescription()
                + ", Cost : " + beverage.cost());
    }
}
