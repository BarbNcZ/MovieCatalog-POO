package br.com.alura.moviecatalog.models;

public class Title {
    private String name;
    private int yearOfRelease;
    private double movieRateCount;
    private int durationInMinutes;
    private int totalRatings;
    private double averageRating;



    public int getTotalRatings(){
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public void showTechSheet(){
        System.out.println("Movie name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    public void rating(double rate){
        movieRateCount += rate;
        totalRatings++;
    }
    public double catchAvarageRating(){
        return movieRateCount / totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}