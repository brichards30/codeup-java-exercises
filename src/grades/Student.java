package grades;

import movies.Movie;
import movies.MoviesArray;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void addGrade(int grade) {grades.add(grade);}

    public double getGradeAverage(){

                double sumOfGrades = 0;
                double amountOfGrades = grades.size();
                for(Integer grade : grades){
                    sumOfGrades += grade;
                }return sumOfGrades/amountOfGrades;
            }

    public static void main(String[] args) {
        Student student = new Student("John");
        student.addGrade(57);
        student.addGrade(68);
        student.addGrade(88);
        System.out.println(student.getGradeAverage());

        Student denise = new Student("Denise");
        denise.addGrade(80);
        denise.addGrade(75);
        denise.addGrade(64);
        System.out.println("Denise's grade average is: " + denise.getGradeAverage());


    }

}
