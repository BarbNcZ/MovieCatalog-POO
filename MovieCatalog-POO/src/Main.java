import br.com.alura.moviecatalog.calculator.TimeCalculator;
import br.com.alura.moviecatalog.models.Movie;
import br.com.alura.moviecatalog.models.Title

public class Main {
    public static void main(String[] args) {
        Movie myFavMovie = new Movie();
        myFavMovie.setName("John Wick");
        myFavMovie.setYearOfRelease(2014);
        myFavMovie.setDurationInMinutes(111);
        myFavMovie.setAverageRating(7.4);

        myFavMovie.showTechSheet();
        myFavMovie.rating(8);
        myFavMovie.rating(9);
        myFavMovie.rating(5);
        System.out.println("Total de avaliacoes " + myFavMovie.getTotalRatings());
        //System.out.println(myFavMovie.catchAvarageRating());

        TimeCalculator calculator = new TimeCalculator();

    }
}