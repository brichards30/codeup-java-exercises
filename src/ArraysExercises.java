import person.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];

        persons[0] = new Person("Beyonce Knowles", 41);
        persons[1] = new Person("Angela Bassett", 63);
        persons[2] = new Person("Viola Davis", 56);

        System.out.println("Original array: ");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());

        }
        System.out.println("");
        persons = addPerson(persons, new Person ("Jazmine Sullivan", 34));

        System.out.println("With added person: ");
       // Run for loop to see added new person
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }
        System.out.println("");
        System.out.println("With added person, enchanced loop: ");

        //Enhanced loop
        for (Person person : persons) {
            System.out.println(person.getName());
        }





    }
}
