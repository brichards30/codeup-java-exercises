public class Person {

    //Objects are not primitive

    public String firstName; //firstName/lastName is the field of type String
    public String lastName;

    public static final int MAX_FIRSTNAME_LENGTH = 50;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public static String abbreviateFirstName(String firstName){
        return firstName.substring(0, 1);
    }

//    public static void foo(){//void doesn't return anything
//
//
//
//    }

    public static void main(String[] args) {

        Person jett = new Person(); //new variable bob of type Person_00Lecture. Create a new object of the Class
        jett.firstName = "Jett";
        jett.lastName = "Fisher";

        Person barbra = new Person();
        barbra.firstName = "Barbra";
        barbra.lastName = "Jackson";

        System.out.println(jett.getFullName());
        System.out.println(barbra.getFullName());

       Person.abbreviateFirstName("Bob");



//        System.out.println(abbreviateFirstName());

//        Person.foo(); //correct way to use static method,

    }
}
