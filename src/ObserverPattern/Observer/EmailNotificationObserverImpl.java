package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotificationObserverImpl implements NotificationObserver{
    String email;
    StocksObservable stocksObservable;

    public EmailNotificationObserverImpl(String email, StocksObservable observable) {
        this.email = email;
        this.stocksObservable = observable;
    }

    @Override
    public void sendUpdates() {
        sendEmail(this.email,"items has been restocked!");
    }

    private void sendEmail(String email, String msg){
        System.out.println("Hey "+email+", "+msg);
    }
}
