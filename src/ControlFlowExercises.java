import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        //1a
//            int i = 5;
//            while (i <= 15) {
//                System.out.print(i + " ");
//                i++;

//            }
        //1C for loop
//            for (int i = 5; i <= 15; i++) {
//                System.out.println(i);
//            }

        //1b.a Do While, count by 2s starting from 0 to 100
//            int i = 0;
//            do {
//                System.out.println(i);
//                i += 2;
//            }
//            while (i <= 100);
//
//      //1b.b Do While, backwards by 5 from 100 to -10
//            int i = 100;
//            do {
//                System.out.println(i);
//                i -= 5;
//            }
//            while (i >= -10);

            //FOR LOOP
//        for (int i = 100; i >= -10 ; i -= 5) {
//            System.out.println(i);
//        }
//
//      //1.b.c Do While, starting at 2 and displayed number squared < 1000000
//            long i = 2;
//            do {
//                System.out.println(i);
//                i *= i;
//            }
//            while (i < 100000);
//
//            //for Loop
//            for (long i = 2; i < 1000000; i *= i) {
//                System.out.println(i);
//            }


        //2. Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//
//            } else {
//                System.out.println(i);
//            }


        //3. Table of Powers
//
        Scanner scanner = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInt ; i++) {
//                System.out.printf("%-6d | %-7d | %-5d\n", i, i * i, i * i * i);
//
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")){
//                userContinues = false;
//            }
//
//        }while (userContinues);

        //4. Convert Number Greats into letter grade (use scanner from previous)
        boolean anotherGrade = true;

        do {
            System.out.print("Please enter number between 0 - 100\n");

            int userGrade = scanner.nextInt();

            if(userGrade >= 88){
                System.out.println("A");
            }else if(userGrade >= 80){
                System.out.println("B");
            }else if(userGrade >= 67){
                System.out.println("C");
            }else if(userGrade >= 60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (y/n)");

            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")){
                anotherGrade = false;
            }


        }while (anotherGrade);








        }
    }
