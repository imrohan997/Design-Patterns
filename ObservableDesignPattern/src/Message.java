/**
 * This class represents the message that is published in Subject.
 */
public class Message {
    String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
