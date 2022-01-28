package education.cursor.milestone3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MilestoneMain3 {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Movie1", Genres.GENRE1, 100);
        Movie movie2 = new Movie("Movie2", Genres.GENRE2, 90);
        Movie movie3 = new Movie("Movie3", Genres.GENRE2, 110);
        Movie movie4 = new Movie("Movie4", Genres.GENRE1, 90);
        Movie movie5 = new Movie("Movie5", Genres.GENRE1, 100);

        List<Movie> movies1 = new ArrayList<>();
        movies1.add(movie1);
        movies1.add(movie2);
        movies1.add(movie3);
        movies1.add(movie4);
        movies1.add(movie5);

        System.out.println("First list of movies: ");
        movies1.forEach(System.out::println);

        Movie movie6 = new Movie("Movie6", Genres.GENRE2, 95);
        Movie movie7 = new Movie("Movie7", Genres.GENRE3, 90);
        Movie movie8 = new Movie("Movie8", Genres.GENRE3, 100);
        Movie movie9 = new Movie("Movie9", Genres.GENRE3, 90);
        Movie movie10 = new Movie("Movie10", Genres.GENRE1, 95);

        List<Movie> movies2 = new ArrayList<>();
        movies2.add(movie6);
        movies2.add(movie7);
        movies2.add(movie8);
        movies2.add(movie9);
        movies2.add(movie10);

        System.out.println("Second list of movies: ");
        movies2.forEach(System.out::println);
        //************************************************************

        Supplier<Stream<Movie>> supplierMovie1Stream = movies1::stream;
        Supplier<Stream<Movie>> supplierMovie2Stream = movies2::stream;
        var moviesQuantityForGenre = Stream.concat(supplierMovie1Stream.get(), supplierMovie2Stream.get())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("\nMovies quantity for a genre: " + moviesQuantityForGenre);

        var avgGenrePrice = Stream.concat(supplierMovie1Stream.get(), supplierMovie2Stream.get())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getTicketPrice)));
        System.out.println("\nAverage price by genre: " + avgGenrePrice);

    }

}
