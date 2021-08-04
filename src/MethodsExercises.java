public class MethodsExercises {

    public static int addition(int num1, int num2){ return num1 + num2;}

    public static int subtraction(int num1, int num2){return num1 - num2;}

    public static int multiply(int num1, int num2){return num1 * num2;}

    public static int divide(int num1, int num2){return num1 / num2;}

    public static int modulus(int num1, int num2){return num1 % num2;}

    public static void main(String[] args) {
        //Addition
        System.out.println(addition(6, 7));
        System.out.println(12 == addition(5, 7));

        //Subtraction
        System.out.println(subtraction(4, 8));
        System.out.println(4 == subtraction(12, 8));

        //Multiplication
        System.out.println(multiply(4, 5));
        System.out.println(30 == multiply(6, 5));

        //Division
        System.out.println(divide(100, 20));
        System.out.println(2 == divide(10, 5));

        //Modulus
        System.out.println(modulus(5, 80));
        System.out.println(4 == modulus(4, 16));



    }


}
