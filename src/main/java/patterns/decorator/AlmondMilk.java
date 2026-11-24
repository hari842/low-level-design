package patterns.decorator;

public class AlmondMilk extends DecoratorClass {
    public AlmondMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", AlmondMilk";
    }
}
