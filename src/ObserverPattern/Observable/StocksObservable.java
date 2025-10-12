package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

public interface StocksObservable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notification(NotificationObserver observer);
    void resetStocks(int stocks);
    int getTotalStocks();
}
