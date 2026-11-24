package patterns.strategy;

public class UpiPayment implements IPayment {
    @Override
    public void pay() {
        System.out.println("UPI PAYMENT!!!!");
    }
}
