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

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }

        persons = addPerson(persons, new Person ("J. Cole", 36));

        //Run for loop to see added new person
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }


    }
}
