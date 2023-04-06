public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("Design Patterns");
        Subscriber subscriber1 = new Subscriber("Rohan");
        Subscriber subscriber2 = new Subscriber("Aditya");
        Subscriber subscriber3 = new Subscriber("Suraj");

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber3);

        Message message =  new Message(youtubeChannel.channelName + " has published Design pattern");
        youtubeChannel.notify(message);

        youtubeChannel.unsubscribe(subscriber3);
        youtubeChannel.subscribe(subscriber2);

        youtubeChannel.notify(message);
    }
}