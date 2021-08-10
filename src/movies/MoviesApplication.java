package movies;

import util.Input;

public class MoviesApplication {
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
                    "5 - View movies in the scifi category\n" +
            return options;
        }

        //PROMPT USER FOR CHOICE
        private static int promptUserForChoice () {
            Input input = new Input();
            System.out.println("Enter your choice: ");
            int userChoice = input.getInt(0, 6);
            return userChoice;
        }

        private static void viewMoviesByCategory (String category){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory();
                }
            }
        }

        private static boolean executeUserChoice (int choice){
            boolean continueRunningApp = true;

            switch (choice) {
                case 0:
                    System.out.println("So long, partner...");
                    continueRunningApp = false;
                    break;
                case 1:
                    System.out.println("\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory();
                    }
                    break;
                case 2:
                    System.out.println("\n");
                    viewMoviesByCategory("animated");
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\n");
                    viewMoviesByCategory("drama");
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    viewMoviesByCategory("horror");
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("\n");
                    viewMoviesByCategory("scifi");
                    System.out.println("\n");
                    break;
            }
            return continueRunningApp;
        }
    }



