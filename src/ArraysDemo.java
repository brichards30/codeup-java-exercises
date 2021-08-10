import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

//        int[] anArray = new int[10];

//        int numberOfElements = 10;
//        int[] anArray = new int[numberOfElements];

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default value
//        //System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!
//
//        int[] anArray = {1, 2, 3, 4, 5, 6};
//
//        System.out.println(anArray.length);
//
//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (String language : languages) {
//            System.out.println(language);
//        }

//        int []scoreCard = {2, 2, 1, 8, 3, 2, 2, 4, 2};
//
//        Arrays.fill(scoreCard, 0);
//
//        System.out.println("The score card has been reset: \n" + Arrays.toString(scoreCard));
////        System.out.println("The score card has been reset: \n" + scoreCard);// returns [I@7e0ea639 or the location
//
//        int[] ogArray = new int[] {1, 2, 3};
//        System.out.println("Original (og) array:");
//
//            int[] copy = Arrays.copyOf(ogArray, 5);
//
//            copy[3] = 11;
//            copy[4] = 30;
//
//        System.out.println(Arrays.toString(copy));
//        for (int i = 0; i < ogArray.length; i++) {
//            System.out.println(ogArray[i] + " ");
//        }
//
//            System.out.println("\nNew array copy after modifications:");
//
//            for (int i = 0; i < copy.length; i++) {
//                System.out.println(copy[i] + " ");
//        }
//
//        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
//
//        //Perform the function
//        Arrays.sort(arr);
//        //Print out using print format
//        System.out.printf("Modified arr[]: %s", Arrays.toString(arr));
//
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7
//
//        String[][] names = {
//                {"Mr.", "Mrs.", "Ms."},
//                {"Smith", "Jones"}
//        };
//
//        System.out.println(names[0][0] + names[1][0]);
//        System.out.println(names[0][2] + names[1][1]);


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) { //n represents each element
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}
