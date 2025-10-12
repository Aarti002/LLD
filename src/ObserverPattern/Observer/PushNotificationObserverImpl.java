package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class PushNotificationObserverImpl implements NotificationObserver {
    String number;
    StocksObservable observable;

    public PushNotificationObserverImpl(String number, StocksObservable observable) {
        this.number = number;
        this.observable = observable;
    }

    @Override
    public void sendUpdates() {
        sendSMS(this.number, "checkout our new stocks!");
    }

    private void sendSMS(String number, String msg) {
        System.out.println(number+": "+msg);
    }
}
