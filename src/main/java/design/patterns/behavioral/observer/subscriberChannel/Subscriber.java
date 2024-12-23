package design.patterns.behavioral.observer.subscriberChannel;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Object {
    List<Subject> channels = new ArrayList<>();
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public List<Subject> getSubscribedChannels() {
        return channels;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + name + ", Your subscribed channel " + channelName + " has just uploaded a video having title `" + videoTitle + "` .");
    }


}
