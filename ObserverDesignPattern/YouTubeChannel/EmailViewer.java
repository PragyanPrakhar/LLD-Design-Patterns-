package ObserverDesignPattern.YouTubeChannel;

public class EmailViewer implements Viewer {
    private String email;

    public EmailViewer(String email) {
        this.email = email;
    }

    @Override
    public void notify(String videoTitle) {
        System.out.println("Sending Email to " + email + ": New Video - " + videoTitle);
    }
}
