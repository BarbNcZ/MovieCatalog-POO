package br.com.alura.moviecatalog.models;

public class Movie extends Title {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }
}