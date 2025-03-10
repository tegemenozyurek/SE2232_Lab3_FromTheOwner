public class Message {
    User sender, receiver;
    String content;

    Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }
}
