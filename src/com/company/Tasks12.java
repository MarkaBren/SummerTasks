package com.company;

import java.util.ArrayList;

public class Tasks12 {



}

interface ICRUD {
    public void create(int title, int description, int director, int country, int genre, int year, int rating);
    public Movie read(int i);
    public void update(int i, Movie movie);
    public void delete(int i);
}

class Movie {
    private String title;
    private String description;
    private String director;
    private String country;
    private String genre;
    private int year;
    private String rating;

    Movie(){

    }

    Movie(String title, String description, String director, String country, String genre, int year, String rating){
        this.title       = title;
        this.description = description;
        this.director    = director;
        this.country     = country;
        this.genre       = genre;
        this.year        = year;
        this.rating      = rating;
    }

    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }


}

abstract class Cinema implements ICRUD {
    private String cinemaName;
    private ArrayList<Movie> films = new ArrayList<Movie>();

    @Override
    public void create(int title, int description, int director, int country, int genre, int year, int rating) {
        films.add(new Movie());

    }

    @Override
    public Movie read(int i) {
        return films.get(i);
    }

    @Override
    public void update(int i, Movie movie) {
        films.set(i, movie);
    }

    @Override
    public void delete(int i) {
        films.remove(i);
    }

    public Movie getMovie(int i){
        return films.get(i);
    }

    public Movie find(String title){
        Movie movie = new Movie();

        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getTitle() == title) return films.get(i);
        }

        return movie;
    }

    public void sort(){
        for (int i = 0; i < films.size()-1; i++) {
            for (int j = 0; j < films.size()-i-1; j++) {
                if(films.get(i).getYear() > films.get(i).getYear()){
                    int t = films.get(i).getYear();
                    films.get(i).setYear(films.get(i).getYear());
                    films.get(j).setYear(t);
                }
            }
        }
    }
}
