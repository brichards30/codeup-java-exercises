package popquiz;

public class PopQuiz {
    public static double multiply(int num1, int num2){
        return num1 * num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(3.5, 2.5));


        Duck duck1 = new Duck("daffy", 2);

        Mallard mallard1 = new Mallard("Duffy", 4);
        mallard1.quack();
        mallard1.getDetails();

    }

}
