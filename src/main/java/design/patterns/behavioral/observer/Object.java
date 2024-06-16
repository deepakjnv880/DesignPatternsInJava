package design.patterns.behavioral.observer;

import java.util.List;

public interface Object {
    //kis kis subject pe najar rkhni h
    List<Subject> getSubscribedChannels();

    //hme aap update kro
    void update(String subjectName, String title);
}
