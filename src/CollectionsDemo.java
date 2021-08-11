import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsDemo {


    public static void main(String[] args) {
        ArrayList <String> lastNames = new ArrayList<>();

        lastNames.add("Richards");
        lastNames.add("Jones");
        lastNames.add("St. Patrick");

        System.out.println(lastNames);

//        //Java Array/add
//        String [] lastNames2 = new String[10];
//        lastNames2 = Arrays.copyOf(lastNames2, lastNames2.length + 1);
//        lastNames2[lastNames2.length - 1] = "Wallace";


        // .size method
        System.out.println("The size of the lastNames array list is: " + lastNames.size() + "\n");

        // .get method

        System.out.println("The element value returned will be 'Richards': " + lastNames.get(0) + "\n");

        // .contains method
        System.out.println("We are checking to see if 'Richards' is an element in the array list: " + lastNames.contains("Richards") + "\n");

        // .remove method example
        System.out.println(lastNames);
        lastNames.remove(0);
        lastNames.remove("St. Patrick");
        System.out.println(lastNames);



        //Reversing an Array List
//        ArrayList<String> someStrings = new ArrayList<>();
//        someStrings.add("bob");
//        someStrings.add("tom");
//        someStrings.add("sue");
//
//        System.out.println("In normal order:");
//        for (String aString : someStrings) {
//            System.out.println(aString);
//        }
//
//        System.out.println("In REVERSE order:");
//        for (int i = someStrings.size() - 1; i >= 0 ; i--) {
//            System.out.println(someStrings.get(i));
//        }

        //Another reverse order solution
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.printf("Modified arr[] : %s",
//                Arrays.toString(arr));

        // .isEmpty
        System.out.println(lastNames.isEmpty()); //returns false

        // .lastIndexOf
        lastNames.add("Richards");
        lastNames.add("St. Patrick");
        lastNames.add("St. Patrick");

        //Return last index of Element
        System.out.println(lastNames.lastIndexOf("St. Patrick"));

        //First index of Element:
        System.out.println(lastNames.indexOf("St. Patrick"));
        System.out.println(lastNames);


        // Syntax for creating a hash app
        HashMap<String, String> usernames = new HashMap<>();

        //.put() method
        usernames.put("Brittany", "brich3030");
        usernames.put("Prince", "prince1958");
        usernames.put("Jeff", "j3ff");

        //Printing out hashmaps:
        System.out.println("3 usernames: " + usernames + "\n");

        //Getting value of hash map key:
        System.out.println(usernames.get("Brittany"));

        //Getting value that doesn't exist
        System.out.println("Returning value of a key that doesn't exist will result in: " + usernames.get("Mary"));

        //.getOrDefault
        System.out.println("This method will return a default value: " + usernames.getOrDefault("Mary", "No username"));

        //.getOrDefault does not set key or value
        System.out.println("Mary has not been added to usernames: " + usernames + "\n");

        //.putIfAbsent() example 1:
        usernames.putIfAbsent("Mary", "replacement value");
        System.out.println("If the key is not in the hash map, this method will set it" + usernames + "\n");

        //.putIfAbsent() example 2:
        usernames.putIfAbsent("Prince", "replacement value");
        System.out.println("This method will not overwrite current/existing values: " + usernames + "\n");


        //.containsValue() or .containsKey()
        System.out.println("Checking for keys where the value contains the default of 'replacement value'" + usernames.containsValue("replacement value") + "\n");

    }


}
