package patterns.decorator;

public class GoatMilk extends DecoratorClass {
    public GoatMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Goat Milk";
    }
}
