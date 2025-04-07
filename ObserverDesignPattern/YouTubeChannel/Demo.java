package ObserverDesignPattern.YouTubeChannel;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Viewer viewer1 = new EmailViewer("alice@gmail.com");
        Viewer viewer2 = new EmailViewer("bob@gmail.com");

        channel.subscribe(viewer1);
        channel.subscribe(viewer2);

        channel.uploadNewVideo("Observer Design Pattern Explained!");
    }
}
