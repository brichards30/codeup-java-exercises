package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;



    public String getString(){

    }

    public boolean yesNo(){
        if (scanner.equals("yes") || scanner.equals("y")){
            return true;
        }else{
            return false;
        }

    }

    public int getInt(int min, int max){

    }


    public static void main(String[] args) {

        Input userInput = new Input();

    }
}
