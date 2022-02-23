package com.example.moviemaker.repositories;

import com.example.moviemaker.Models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Repository {

    ArrayList<Movie> allMovies = new ArrayList<>();

    public ArrayList<Movie> getAllMovies() {
        listOfMovies();
        return allMovies;
    }

    public void setAllMovies() {
        this.allMovies = allMovies;
    }

    public void listOfMovies() {
        File data = new File("resources/imdb-data.csv");
        try {
            Scanner fileReader = new Scanner(data);
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] stringAsArray = line.split(";");
                int year = Integer.parseInt(stringAsArray[0]);
                int length = Integer.parseInt(stringAsArray[1]);
                String title = stringAsArray[2];
                String subject = stringAsArray[3];
                int popularity = Integer.parseInt(stringAsArray[4]);

                boolean awards = false;
                if (stringAsArray[5].equals("Yes")) {
                    awards = true;
                }

                Movie currentMovie = new Movie(year, length, title, subject, popularity, awards);
                allMovies.add(currentMovie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File has not been found.");
            e.printStackTrace();
        }
    }
}
