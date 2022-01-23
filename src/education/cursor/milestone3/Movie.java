package education.cursor.milestone3;

public class Movie {

    private String title;
    private Genres genre;
    private int ticketPrice;

    Movie(String title, Genres ticketGenre, int ticketPrice) {
        this.title = title;
        this.genre = ticketGenre;
        this.ticketPrice = ticketPrice;
    }


    @Override
    public String toString() {
        return "{title='" + title + '\'' +
                ", ticketGenre=" + genre +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
