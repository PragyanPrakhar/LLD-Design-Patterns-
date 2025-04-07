package ObserverDesignPattern.YouTubeChannel;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
    private List<Viewer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Viewer viewer) {
        subscribers.add(viewer);
    }

    @Override
    public void unsubscribe(Viewer viewer) {
        subscribers.remove(viewer);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Viewer v : subscribers) {
            v.notify(videoTitle);
        }
    }

    public void uploadNewVideo(String title) {
        System.out.println("New Video Uploaded: " + title);
        notifySubscribers(title);
    }
}