package ObserverPattern;

import ObserverPattern.Observable.PixelStocksObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.iPhoneStocksObservableImpl;
import ObserverPattern.Observer.EmailNotificationObserverImpl;
import ObserverPattern.Observer.NotificationObserver;
import ObserverPattern.Observer.PushNotificationObserverImpl;

public class StocksController {
    public static void main(String args[]) {
        StocksObservable observable = new iPhoneStocksObservableImpl();
        StocksObservable observable_1 = new PixelStocksObservableImpl();

        NotificationObserver sub1 = new EmailNotificationObserverImpl("xyz@yahoo.com", observable);
        NotificationObserver sub2 = new PushNotificationObserverImpl("9876542321", observable);
        NotificationObserver sub_1 = new EmailNotificationObserverImpl("xyz1@yahoo.com", observable_1);
        NotificationObserver sub_2 = new PushNotificationObserverImpl("7867453256", observable_1);
        observable.addObserver(sub1);
        observable.addObserver(sub2);
        observable.resetStocks(10);
        observable.removeObserver(sub1);

        observable_1.addObserver(sub_1);
        observable_1.addObserver(sub_2);
        observable_1.resetStocks(12);
        observable_1.removeObserver(sub_1);
    }
}
