package patterns.strategy;

public class Phonepe extends AbstractApplications {
    public Phonepe() {
        payment = new UpiPayment();
    }
}
