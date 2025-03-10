import java.util.ArrayList;
import java.util.List;

class Marketplace {
    List<User> users = new ArrayList<>();
    List<Listing> listings = new ArrayList<>();

    User registerUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        return user;
    }

    List<Listing> searchListings(double minPrice, double maxPrice) {
        List<Listing> results = new ArrayList<>();
        for (Listing listing : listings) {
            if (listing.price >= minPrice && listing.price <= maxPrice) {
                results.add(listing);
            }
        }
        return results;
    }
}
