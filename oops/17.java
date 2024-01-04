// Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;
import java.util.List;

class Movie {
private String title;
// private String director;
// private List< String > actors;
private List< String > reviews;

public Movie(String title, String director, List< String > actors) {
this.title = title;
// this.director = director;
// this.actors = actors;
this.reviews = new ArrayList< String >();
}

public void addReview(String review) {
reviews.add(review);
} public List< String > getReviews() { return reviews;
}

public static void main(String[] args) {
List< String > actors = new ArrayList< String >();
actors.add("Actor 1");
actors.add("Actor 2");

Movie movie = new Movie("Movie Title", "Director Name", actors);

movie.addReview("Great movie, loved it!");
movie.addReview("The acting was amazing.");

List< String > movieReviews = movie.getReviews();
System.out.println("Reviews for " + movie.title + ":");
for (String review : movieReviews) {
System.out.println("- " + review);
}
}
}