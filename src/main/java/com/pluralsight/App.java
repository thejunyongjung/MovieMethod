package com.pluralsight;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an object of the type Movie (which had blueprint with specific p
        Movies m1 = new Movies();
        m1.movieTitle = "The matrix";
        m1.movieYear = 2018;
        m1.mainActor = "Will Smith";
        m1.amountOfMinutes = 5;

        Movies m2 = new Movies();
        m2.movieTitle = "Jumanji";
        m2.movieYear = 2017;
        m2.mainActor = "Dwayne Johnson";
        m2.amountOfMinutes = 90;

        Movies m3 = new Movies();
        m3.movieTitle = "Iron Man";
        m3.movieYear = 2012;
        m3.mainActor = "RDJ";
        m3.amountOfMinutes = 125;

        // Calling a function

        m1.DisplayMovieInformation();
        m1.playInto();
        pause(m1);
        System.out.println();

        m2.DisplayMovieInformation();
        m2.playInto();
        pause(m2);
        System.out.println();

        m3.DisplayMovieInformation();
        m3.playInto();
        pause(m3);


    }
    //This is a method with 1 parameter (that will pass variables as a value as an argument)
    public static void pause(Movies _anyMovie) {

        System.out.println("Please " + _anyMovie.mainActor + " press a button to continue starting your film that will take up " + _anyMovie.amountOfMinutes + " amount of minute.");

    }

}


