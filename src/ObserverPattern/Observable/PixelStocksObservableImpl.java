package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class PixelStocksObservableImpl implements StocksObservable {
    List<NotificationObserver> subscribers = new ArrayList<>();
    int totalStocks = 0;

    @Override
    public void addObserver(NotificationObserver observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notification(NotificationObserver observer) {
        observer.sendUpdates();
    }

    @Override
    public void resetStocks(int stocks) {
        this.totalStocks+=stocks;
        for(NotificationObserver obs:subscribers){
            notification(obs);
        }
    }

    @Override
    public int getTotalStocks() {
        return this.totalStocks;
    }
}
