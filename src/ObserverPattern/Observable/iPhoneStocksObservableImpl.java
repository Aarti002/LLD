package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class iPhoneStocksObservableImpl implements StocksObservable {
    List<NotificationObserver> subscribers = new ArrayList<>();
    int totalStocks;

    @Override
    public void addObserver(NotificationObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notification(NotificationObserver observer) {
        observer.sendUpdates();
    }

    @Override
    public void resetStocks(int newStocks) {
        this.totalStocks+=newStocks;
        for(NotificationObserver obs: subscribers) {
            notification(obs);
        }
    }

    @Override
    public int getTotalStocks(){
        return this.totalStocks;
    }
}
