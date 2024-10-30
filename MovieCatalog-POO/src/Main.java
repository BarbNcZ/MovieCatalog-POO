public class Main {
    public static void main(String[] args) {
        Movie myFavMovie = new Movie();
        myFavMovie.name = "John Wick";
        myFavMovie.yearOfRelease = 2014;
        myFavMovie.durationInMinutes = 111;
        myFavMovie.averageRating = 7.4;

        myFavMovie.showTechSheet();
        myFavMovie.rating(8);
        myFavMovie.rating(9);
        myFavMovie.rating(5);
        System.out.println(myFavMovie.totalRatings);
        System.out.println(myFavMovie.movieRateCount);
    }
}
