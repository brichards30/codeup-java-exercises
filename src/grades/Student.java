package grades;
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

    public void addGrade(int grade) {this.grades.add(grade);}

    public double getGradeAverage(){

                double sumOfGrades = 0;
//                double amountOfGrades = grades.size();
                for(Integer grade : grades){
                    sumOfGrades += grade;
                }return sumOfGrades / grades.size();
            }

    public static void main(String[] args) {
        Student john = new Student("John");
        john.addGrade(57);
        john.addGrade(68);
        john.addGrade(88);
        System.out.println("John's grade average is: " + john.getGradeAverage());

        Student denise = new Student("Denise");
        denise.addGrade(80);
        denise.addGrade(75);
        denise.addGrade(85);
        System.out.println("Denise's grade average is: " + denise.getGradeAverage());


    }

}
