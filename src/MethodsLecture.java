import java.util.Scanner;

public class MethodsLecture {

//DECLARE METHODS INSIDE OF THE CLASS, OUTSIDE MAIN

    static double piValue = 3.14;

    public static String sayHello(String userName) {
        String helloMessage = String.format("Hello, %s!", userName);
        return helloMessage;
    }

    public static double getAreaOfCircle(float radius) {
        return piValue * (radius * radius);
    }

    public static double getAreaOfCircle(double radius) {
        return piValue * (radius * radius);
    }

    public static double getAreaOfCircle(long radius) {
        return piValue * (radius * radius);
    }

    public static boolean doesUserWantToContinue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue?");

        String userResponse = input.nextLine();

        if (userResponse.equals("yes")) {
            return true;
        } else if (userResponse.equals("no")) {
            return false;
        } else {
            return doesUserWantToContinue();
        }

    }

    //THIS EXECUTES CODE. METHODS SHOULD NOT BE DECLARED INSIDE MAIN
    public static void main(String[] args) {
        if (doesUserWantToContinue()) {
            System.out.println(sayHello("Jett"));

            int radiusOfCircle = 4;

            System.out.println(getAreaOfCircle(radiusOfCircle));

        }
    }
}
