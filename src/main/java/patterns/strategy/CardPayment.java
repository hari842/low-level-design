package patterns.strategy;

public class CardPayment implements IPayment {
    @Override
    public void pay() {
        System.out.println("CARD PAYMENT!!!!!");
    }
}
