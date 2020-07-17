package models;

import java.util.Objects;

public class Review {
    private String content;
    private String writtenBy;
    private int rating;
    private int id;
    private int restaurantId; //will be used to connect Restaurant to Review (one-to-many)

    public Review(String content, String writtenBy, int rating, int restaurantId) {
        this.content = content;
        this.writtenBy = writtenBy;
        this.rating = rating;
        this.restaurantId = restaurantId;
    }

    public String getContent() {
        return content;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public int getRating() {
        return rating;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public int getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return rating == review.rating &&
                restaurantId == review.restaurantId &&
                content.equals(review.content) &&
                writtenBy.equals(review.writtenBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, writtenBy, rating, restaurantId);
    }
}

