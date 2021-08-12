package exceptions;

import util.Input;

import java.util.InputMismatchException;
import java.util.Locale;

public class ExceptionsLecture {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        //System.out.println(myArray[5]);

        try {
            Input input = new Input();
            System.out.println("Enter an int: ");
            input.getInt();
//            throw new RuntimeException("Oops!");
        }  catch (InputMismatchException e) {
//            System.out.println("OUCH! An exception has occured: " + e.getMessage());
            e.printStackTrace();

//        catch (RuntimeException e) {
//            System.out.println("OUCH! Runtime Exception");
        }
            //cannot run after exception unless there's a try/catch
            System.out.println("End of program.");

        }
    }

