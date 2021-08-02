import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %1.2f.", pi);

        Scanner scanner = new Scanner(System.in); //system.in connected to console input
        System.out.print("Enter an integer: ");//prompt
//        String userInput = scanner.next();//tells console to wait for keyboard entries and only returns the first token
        String userInput = scanner.nextLine();// scanner waits for whole line and then advances to next line
        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}