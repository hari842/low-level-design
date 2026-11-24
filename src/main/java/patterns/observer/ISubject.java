package patterns.observer;

public interface ISubject {
    void registerObservers(IOrderObserver orderObserver);
    void removeObservers(IOrderObserver orderObserver);
    void notifyObservers();
}
