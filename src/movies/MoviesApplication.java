package movies;


import person.Person;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        Movie[] newMovies = Arrays.copyOf(movies, movies.length + 1);
        newMovies[newMovies.length - 1] = movie;
        return newMovies;
    }
    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);
        }

    }


        private static String returnMenuDisplay () {
            String options = "What would you like to do?\n" + "\n" +
                    "0 - Exit\n" +
                    "1 - View all movies\n" +
                    "2 - View movies in the animated category\n" +
                    "3 - View movies in the drama category \n" +
                    "4 - View movies in the horror category\n" +
                    "5 - View movies in the scifi category\n";
            return options;
        }

        //PROMPT USER FOR CHOICE
        private static int promptUserForChoice () {
            Input input = new Input();
            System.out.println("Enter your choice: ");
            int userChoice = input.getInt(0, 5);
            return userChoice;
        }

        private static void viewMoviesByCategory (String category){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
            }
        }

        private static boolean executeUserChoice (int choice){
            boolean continueApp = true;

            switch (choice) {
                case 0: //EXIT
                    System.out.println("Goodbye!");
                    continueApp = false;
                    break;
                case 1: //VIEW ALL MOVIES
                    System.out.println("\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2: //VIEW ALL ANIMATED MOVIES
                    System.out.println("\n");
                    viewMoviesByCategory("animated");
                    System.out.println("\n");
                    break;

                case 3: //VIEW ALL DRAMA MOVIES
                    System.out.println("\n");
                    viewMoviesByCategory("drama");
                    System.out.println("\n");
                    break;
                case 4: //VIEW ALL HORROR MOVIES
                    System.out.println("\n");
                    viewMoviesByCategory("horror");
                    System.out.println("\n");
                    break;

                case 5: //VIEW ALL SCI-FI MOVIES
                    System.out.println("\n");
                    viewMoviesByCategory("scifi");
                    System.out.println("\n");
                    break;
            }
            return continueApp;
        }

    }



