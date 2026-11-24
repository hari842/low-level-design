package patterns.observer;

public class SmsNotification implements IOrderObserver {
    @Override
    public void update(String orderStatus) {
        System.out.println("Sms sent: Order status is " + orderStatus);
    }
}
