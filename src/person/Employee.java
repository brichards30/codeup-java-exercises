package person;

public class Employee extends Person{

    private String position;
    private long id;
    private double salary;

    public Employee(String name, int age){
        super(name, age);
    }

    public Employee(String name, int age, String position, long id, double salary) {
        super(name, age);
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        Employee newEmployee = new Employee("James St. Patrick", 35, "Founder/CEO", 1, 35000);

        System.out.println(newEmployee.getName());
        System.out.println(newEmployee.getPosition());
        System.out.println(newEmployee);
    }
}
