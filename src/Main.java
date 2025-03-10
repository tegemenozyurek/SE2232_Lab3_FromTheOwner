import java.util.List;

public class Main {
    public static void main(String[] args) {
        Marketplace marketplace = new Marketplace();

        User alice = marketplace.registerUser("alice", "password123");
        User bob = marketplace.registerUser("bob", "securepass");

        alice.createListing("Laptop", "Gaming laptop", 1200);
        bob.createListing("Phone", "Brand new phone", 800);

        System.out.println("Listings:");
        for (Listing listing : marketplace.listings) {
            System.out.println(listing.title + " - $" + listing.price);
        }

        alice.sendMessage(bob, "Is the phone still available?");
        System.out.println("\nMessages for Bob:");
        for (Message msg : bob.messages) {
            System.out.println(msg.sender.username + ": " + msg.content);
        }

        List<Listing> results = marketplace.searchListings(500, 1500);
        System.out.println("\nSearch Results:");
        for (Listing listing : results) {
            System.out.println(listing.title + " - $" + listing.price);
        }

        alice.rateSeller(bob, 5, "Great seller!");
        System.out.println("\nReviews for Bob's Listings:");
        for (Listing listing : bob.listings) {
            for (Review review : listing.reviews) {
                System.out.println(review.reviewer.username + " rated " + review.rating + "/5 - " + review.review);
            }
        }
    }
}
