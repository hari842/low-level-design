package patterns.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        AbstractApplications application = new Phonepe();
        application.makePayment();

        AbstractApplications applicationWithCard = new Phonepe();
        applicationWithCard.setPayment(new CardPayment());
        applicationWithCard.makePayment();
    }
}
