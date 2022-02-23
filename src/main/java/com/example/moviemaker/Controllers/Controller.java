package com.example.moviemaker.Controllers;

import com.example.moviemaker.Services.Service;
import com.example.moviemaker.repositories.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    private Service service = new Service();
    private Repository rep = new Repository();

    // Welcome-line
    @GetMapping("")
    public String welcome() {
        return "Hi welcome to my site :) \nI'm not quite sure what this does yet.";
    }

    // Show first movie's title in list
    @GetMapping("/getFirst")
    public String firstMovie() {
        return service.csvFirstTitle(rep.getAllMovies());
    }

    // Show the title of a random movie
    @GetMapping("/getRandom")
    public String randomMovie(){
        return service.csvRandomTitle(rep.getAllMovies());
    }

    // Picks 10 random movies and sorts them by popularity
     @GetMapping("getTenSortByPopularity")
    public ArrayList top10() {
       return service.cvsGetRandomTenSort(rep.getAllMovies());
     }

     // Counts how many movies have won an award
    // Displayed number never resets upon multiple uses of the method, was unable to find solution
    @GetMapping("/howManyWonAnAward")
    public int howManyAwards() {
        return service.awardsWon(rep.getAllMovies());
    }
}
