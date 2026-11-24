package patterns.decorator;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 0.5;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
