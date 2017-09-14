import java.util.Date;

public class PrivateMessage extends AbstractMessage {

    private User recipient;

    public PrivateMessage(int messageId, String text, User author, Date date, User recipient) {
        super.messageId = messageId;
        super.text = text;
        super.author = author;
        super.date = date;
        this.recipient = recipient;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send(MessageStorage messageStorage) {
        messageStorage.add(PrivateMessage.this);
    }

    @Override
    public String toString() {
        return  "Private " + super.toString() + ", recipient: " + recipient;
    }
}
