package ObserverDesignPattern.YouTubeChannel;

// Publisher
public interface Channel {
    void subscribe(Viewer viewer);
    void unsubscribe(Viewer viewer);
    void notifySubscribers(String videoTitle);
}
