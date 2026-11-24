package patterns.strategy;

public class GooglePay extends AbstractApplications {
    public GooglePay() {
        payment = new CardPayment();
    }
}
