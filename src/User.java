import java.util.ArrayList;
import java.util.List;

public class User {
    String username, password;
    List<Listing> listings = new ArrayList<>();
    List<Message> messages = new ArrayList<>();

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void createListing(String title, String description, double price) {
        listings.add(new Listing(this, title, description, price));
    }

    void sendMessage(User receiver, String content) {
        Message msg = new Message(this, receiver, content);
        receiver.messages.add(msg);
    }

    void rateSeller(User seller, int rating, String review) {
        seller.listings.forEach(listing -> listing.reviews.add(new Review(this, rating, review)));
    }
}