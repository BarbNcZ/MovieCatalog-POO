public class Movie {
    String name;
    int yearOfRelease;
    double movieRateCount;
    int durationInMinutes;
    int totalRatings;
    double averageRating;
    double

    void showTechSheet(){
        System.out.println("Movie name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    void rating(double rate){
        movieRateCount += rate;
        totalRatings++;
    }
}