import java.util.ArrayList;
import java.util.List;

public class Listing {
    User seller;
    String title, description;
    double price;
    List<Review> reviews = new ArrayList<>();

    Listing(User seller, String title, String description, double price) {
        this.seller = seller;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}