/**
 * This subject interface represents publisher
 */
public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notify(Message message);
}
