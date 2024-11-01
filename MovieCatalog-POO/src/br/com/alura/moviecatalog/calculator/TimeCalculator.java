package br.com.alura.moviecatalog.calculator;

import br.com.alura.moviecatalog.models.Movie;
import br.com.alura.moviecatalog.models.Series;
import br.com.alura.moviecatalog.models.Title;

public class TimeCalculator{
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Movie m){
//        totalTime += m.getDurationInMinutes();
//    }
//
//    public void include(Series s){
//        totalTime += s.getDurationInMinutes();
//    }

    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}
