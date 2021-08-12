package grades;

import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student studentRonnie = new Student("Ronnie");
        studentRonnie.addGrade(80);
        studentRonnie.addGrade(70);
        studentRonnie.addGrade(85);

        Student studentBobby = new Student("Bobby");
        studentBobby.addGrade(72);
        studentBobby.addGrade(94);
        studentBobby.addGrade(87);

        Student studentRicky = new Student("Ricky");
        studentRicky.addGrade(90);
        studentRicky.addGrade(94);
        studentRicky.addGrade(89);

        Student studentMike = new Student("Mike");
        studentMike.addGrade(84);
        studentMike.addGrade(85);
        studentMike.addGrade(83);

        students.put("ne-ronnie", studentRonnie);
        students.putIfAbsent("ne-bobby", studentBobby);
        students.putIfAbsent("ne-ricky", studentRicky);
        students.putIfAbsent("ne-mike", studentMike);

        cmdLineInterface(students);
    }

    public static void cmdLineInterface(HashMap<String, Student> students) {

        Input input = new Input();

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students: ");

        do {

            for (String key : students.keySet()) {
                System.out.printf("|" + key + "| ");
            }

            System.out.println("\n" + "\nWhat student would like to see more information on? " );

            String userResponse = input.getString();

            if (students.containsKey(userResponse)) {

                Student currentStudent = students.get(userResponse);

                System.out.println("Name: " + currentStudent.getName() + " - " + "Github Username: " + userResponse);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse + ".");
            }

            System.out.println("\nWould you like to see another student?");
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");
    }
}