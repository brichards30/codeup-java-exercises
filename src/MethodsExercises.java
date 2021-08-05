import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    static Scanner input = new Scanner(System.in);

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {

        do {
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = input.nextInt();

            if (userInput >= min && userInput <= max) {
                return userInput;
            }
        } while (true);
    }

//    //Sam's version
//    public static String getFactorialString(int num) {
//        String stringToReturn = "";
//
//        for (int i = 1; i <= num; i++) {
//            if (i == num) {
//                stringToReturn += i;
//            } else {
//                stringToReturn += i + " x ";
//            }
//
//        }return stringToReturn;
//    }
//
//    public static void getFactorial(){
//        int userInput = getInteger(1, 10);
//        long factor = 1;
//
//        //Sam's version
////        for (int i = 1; i <= userInput; i++) {
////            System.out.println(i + "! = " + getFactorialString(i) + " = " + i);
////        }
//
//        for (int i = userInput; i > 0; i--) {
//            factor *= i;
//        }
//        System.out.println(factor);
//    }



    public static void main(String[] args) {
//        //Addition
//        System.out.println(addition(6, 7));
//        System.out.println(12 == addition(5, 7));
//
//        //Subtraction
//        System.out.println(subtraction(4, 8));
//        System.out.println(4 == subtraction(12, 8));
//
//        //Multiplication
//        System.out.println(multiply(4, 5));
//        System.out.println(30 == multiply(6, 5));
//
//        //Division
//        System.out.println(divide(100, 20));
//        System.out.println(2 == divide(10, 5));
//
//        //Modulus
//        System.out.println(modulus(5, 80));
//        System.out.println(4 == modulus(4, 16));

        //2.
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);

        //3.
//        getFactorial();
//        getFactorialString();




    }


}
