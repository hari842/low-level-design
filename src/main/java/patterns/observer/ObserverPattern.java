package patterns.observer;

import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        List<IOrderObserver> orderObservers = List.of(
                new EmailNotification(),
                new SmsNotification(),
                new WhatsappNotification()
        );

        OrderService orderService = new OrderService();
        for (IOrderObserver observer : orderObservers) {
            orderService.registerObservers(observer);
        }

        ProductOrder productOrder = new ProductOrder();
        productOrder.registerObservers(new WhatsappNotification());

        orderService.updateOrderStatus("SHIPPING");
        productOrder.updateOrderStatus("APPROVED");
    }
}
