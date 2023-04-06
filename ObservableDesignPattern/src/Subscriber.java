/**
 * This is subscriber class which represents the subscribers of  youtube channel.
 */
public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println("Hey " + this.name + "! " + message.getMessageContent());
    }
}
