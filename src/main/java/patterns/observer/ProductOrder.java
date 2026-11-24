package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductOrder implements ISubject {
    private final List<IOrderObserver> orderObservers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void registerObservers(IOrderObserver orderObserver) {
        orderObservers.add(orderObserver);
    }

    @Override
    public void removeObservers(IOrderObserver orderObserver) {
        orderObservers.remove(orderObserver);
    }

    @Override
    public void notifyObservers() {
        for (IOrderObserver orderObserver : orderObservers) {
            orderObserver.update(orderStatus);
        }
    }

    public void updateOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        notifyObservers();
    }
}
