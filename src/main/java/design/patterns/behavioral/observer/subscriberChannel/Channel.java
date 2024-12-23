package design.patterns.behavioral.observer.subscriberChannel;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    String name;
    List<Object> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Object subscriber) {
        subscriber.getSubscribedChannels().add(this);
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Object subscriber) {
        subscriber.getSubscribedChannels().remove(this);
        subscribers.remove(subscriber);
    }

    @Override
    public void upload(String videoTitle) {
        System.out.println("Uploading the video with title : " + videoTitle);
        this.notifySubscribers(videoTitle);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Object subscriber : subscribers) {
            subscriber.update(name, videoTitle);
        }
    }
}
