import java.util.ArrayList;
import java.util.List;

/**
 * This is YoutubeChannel class which is subscribed by many subscriber
 */
public class YoutubeChannel implements Subject{

    String channelName;
    List<Observer> observers;
    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(Message message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
