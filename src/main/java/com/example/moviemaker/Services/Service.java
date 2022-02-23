package com.example.moviemaker.Services;

import com.example.moviemaker.Models.Movie;

import java.util.*;

public class Service {

    private Random rdm = new Random();

    public String csvFirstTitle(ArrayList<Movie> allMovies) {
            return allMovies.get(0).getTitle();
    }

    public String csvRandomTitle(ArrayList<Movie> allMovies) {
       int rdmMovie = rdm.nextInt(allMovies.size());
       return allMovies.get(rdmMovie).getTitle();
    }

    public ArrayList cvsGetRandomTenSort(ArrayList<Movie> allMovies) {
        ArrayList<Movie> rdmTen = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rdmTen.add(csvRandomMovie(allMovies));
        }
        Collections.sort(rdmTen);
        return rdmTen;
    }

    public Movie csvRandomMovie(ArrayList<Movie> allMovies) {
        int rdmMovie = rdm.nextInt(allMovies.size());
        return allMovies.get(rdmMovie);
    }

    public int awardsWon(ArrayList<Movie> allMovies) {
        int counter = 0;

        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).isAwards()) {
                counter++;
            }
        }
        return counter;
    }
}

