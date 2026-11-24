package patterns.decorator;

public class Cappuccino extends Beverage {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
