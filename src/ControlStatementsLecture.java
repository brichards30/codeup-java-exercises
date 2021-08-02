import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main(String[] args) {

//        System.out.println(3 >= 4);

        String myName = "Brittany";
        int age = 30;

        String herName = "Britney";

        //System.out.println(myName.equals(herName));// do not use == to compare strings in Java

        boolean isUserNamedBrittanyAndIsSheThirty = (myName.equals("Brittany") && age >= 30);

        //System.out.println(myName + " meeting the criteria is " + isUserNamedBrittanyAndIsSheThirty + ".");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue?");
        // boolean usersResponsedYes = scanner.next().equals("y");
        String usersResponse = scanner.nextLine();
        boolean usersRespondedYes = usersResponse.toLowerCase().contains("y");

        System.out.println(usersRespondedYes);

        if (usersResponse.equals("YES!")){
            System.out.println("Wow! Someone is really enthusiastic!");
        } else if (usersRespondedYes){
            System.out.println("Ok, we will continue.");
        }else{
            System.out.println("Ok, we will stop here.");
        }

        //Ask user for fave color
        System.out.println("What is your favorite color?");
        String userFaveColor = scanner.nextLine();

        switch (userFaveColor) {
            case "blue":
                System.out.println("No way! That's mine too!");
                // Fall through aka break
                break;
            case "purple":
                System.out.println("That's the color of royalty!");
                break;
            default:
                System.out.println("That's a nice color!");
                break;
        }


        boolean userAcceptedTerms = false;

        while(!userAcceptedTerms){
            System.out.println("Would you like to extend your car's warranty?");
            userAcceptedTerms = scanner.next().toLowerCase().contains("y");
        }

        System.out.println("Thank you for extending to extend your car's warranty!");

        boolean isThisUsersName = false;

        do {
            System.out.println("Type in your name");
            isThisUsersName = scanner.nextLine().equals("brittany");

        }while (!isThisUsersName);

        System.out.println("You're so smart! You know your name!");



    //this is a classic for loop
        for(int i = 0; i <= 100; i++){
            System.out.println("We are at number: " + i + ".");
        }
//
        //for loop that will skip 23
//        for (int i = 0; i < 100; i++) {
//            if (i == 23){
//                System.out.println("Skipping 23.");
//                continue;
//            }
//            System.out.println(i);
//        }
        for (int i = 0; i < 100; i++) {
        if (i == 23){
            System.out.println("Breaking at 23.");
            break;
        }
        System.out.println(i);
    }

    }
}
