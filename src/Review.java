public class Review {
    User reviewer;
    int rating;
    String review;

    Review(User reviewer, int rating, String review) {
        this.reviewer = reviewer;
        this.rating = rating;
        this.review = review;
    }
}