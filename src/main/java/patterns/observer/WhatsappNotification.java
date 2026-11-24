package patterns.observer;

public class WhatsappNotification implements IOrderObserver {
    @Override
    public void update(String orderStatus) {
        System.out.println("Whatsapp sent: Order status is " + orderStatus);
    }
}
