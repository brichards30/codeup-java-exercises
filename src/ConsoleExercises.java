import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //1.
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %1.2f.", pi);

        //Scanner Class 1.
        Scanner scanner = new Scanner(System.in); //system.in connected to console input
//        System.out.print("Enter an integer: ");//prompt
//        String userInput = input.nextInt();//tells console to wait for keyboard entries and only returns the first token
//        String userInput = scanner.nextLine();// scanner waits for whole line and then advances to next line
//
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //2.
//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("%s\n %s\n %s", userInput1, userInput2, userInput3);

        //3.
//        System.out.print("Enter a sentence: \n");
//        String userSentence = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userSentence + "\" <--");

        //Calculate Perimeter 1.
//        System.out.print("Enter in the length and width of classroom");
//        String lengthWidth = scanner.nextLine();
//        double area = (Double.parseDouble(lengthWidth) * Double.parseDouble(lengthWidth));
//        double perimeter = (Double.parseDouble(lengthWidth) *2) + (Double.parseDouble(lengthWidth) * 2);
//        System.out.printf("The area of the classroom is %1.0f. The perimeter of the classroom is: %1.0f.", area, perimeter);

        //Alternative Calculate Perimeter
        System.out.println("Enter in the width of classroom: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the length of classroom: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;

        double perimeter = (2 * length) + (2 * width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);




    }


}