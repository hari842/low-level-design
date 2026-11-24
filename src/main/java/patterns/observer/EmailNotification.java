package patterns.observer;

public class EmailNotification implements IOrderObserver {
    @Override
    public void update(String orderStatus) {
        System.out.println("Email sent: Order status is " + orderStatus);
    }
}
