package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up and buy");
    }

    public void sendEmail(String emailId, String message) {
        System.out.println("Sending email to " + emailId + " with message: " + message);
    }

}
