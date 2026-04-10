package com.pluralsight;

public class Movies {

    // A description of an object
    // Also a blueprint to create more movies
    String movieTitle;
    int movieYear;
    String mainActor;
    int amountOfMinutes;

    public void playInto() {
        System.out.println("Welcom to Netflix. The movie " + this.movieTitle + " is playing");
    }
    public void DisplayMovieInformation() {
        System.out.println("Movie Title: " + this.movieTitle);
        System.out.println("Movie Year: " + this.movieYear);
        System.out.println("Main Actor: " + this.mainActor);
        System.out.println("Duration: " + this.amountOfMinutes);
    }
}
