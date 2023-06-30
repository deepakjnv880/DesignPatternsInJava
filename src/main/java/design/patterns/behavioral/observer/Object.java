package design.patterns.behavioral.observer;

import java.util.List;

public interface Object {
    List<Subject> getSubscribedChannels();

    void update(String subjectName, String title);
}
