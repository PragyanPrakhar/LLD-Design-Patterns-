package ObserverDesignPattern.Observer;

public class MobileAlertObseverImpl implements NotificationAlertObserver {
    String username;
    StockObservable observable;

    public MobileAlertObseverImpl(String username, StockObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock hurry up and buy");
    }

    private void sendMsgOnMobile(String username, String message) {
        System.out.println("Sending message to " + username + " with message: " + message);
    }
}
