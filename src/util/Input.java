package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);



    public String getString(){
        System.out.println("Say something: ");
        String userInput = scanner.nextLine();
        return userInput;


    }

    public boolean yesNo(){
        System.out.println("Do you like pizza (y/n)?");
        String userResponse = scanner.nextLine();
        if (userResponse.equals("yes") || userResponse.equals("y")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number: ");
        int userResponse = scanner.nextInt();
        if (userResponse >= min && userResponse <= max) {
            System.out.println("Yay! " + userResponse + " is within the range!");
            return userResponse;
        }else{
            return getInt(min, max);
        }

    }

    public int getInt(){
        System.out.println("Enter a whole number: ");
        int usersInteger = scanner.nextInt();
        return usersInteger;
    }

    public double getDouble (double min, double max){
        System.out.println("Enter a number with a decimal: ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("Yay! " + userInput + " is within the range!");
            return userInput;
        }else{
            System.out.printf("Try again.");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number with a decimal: ");
        double userNumber = scanner.nextDouble();
        return userNumber;
    }
}
