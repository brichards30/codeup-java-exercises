package person;

public class Person {
    private String name;
    private int age;

    //CONSTRUCTORS
    public Person() {//default constructor/no-arg constructor

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //METHODS
    public String getName() {
// return the person's name
        return name;
    }

    public void setName(String name) {
// change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
// print a message to the console using the person's name
        System.out.println("Hello " + getName());
    }

    public static void main(String[] args) {
        Person denise = new Person();
        denise.setName("Tim");//
        denise.sayHello();
//        person.Person person1 = new person.Person("John");
//        person.Person person2 = new person.Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        Person person1 = new Person();
        Person person2 = person1;
        System.out.println(person1 == person2);


    }
}


//NOTES
//    //Objects are not primitive
//    //NEVER HAVE PUBLIC FIELDS FOR A CLASS
//
//    private String firstName; //firstName/lastName is the field of type String
//    private String lastName;
//
//    public static final int MAX_FIRSTNAME_LENGTH = 50;
//
//    //CONSTRUCTORS
//    //no arg constructor takes in no parameters. Also don't return anything
//    //goes into creation of object
//    //get executed
//
//    public person.Person(){
////        System.out.println("my constructor called");
//        this("unknown", "unknown");
//    }
//
//    public person.Person(String firstName){
//        //call 2-argument constructor using the keyword this
//        //we do not call constructors inside the class itself using person.Person(...)
//        //instead do this(...)
//        this(firstName, "unknown");
//    }
//
//    //OVERLOADED CONSTRUCTOR
////    public person.Person(String firstName){
////        //this.firstName allows us to refer to global field firstName
////        //firstName by itself refers to the PARAMETER called firstName
////        this.firstName = firstName;
////        System.out.println("Global " + this.firstName + "param" + firstName);
////    }
//
//    public person.Person(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFullName(){
//        return firstName + " " + lastName;
//    }
//
//    public static String abbreviateFirstName(String firstName){
//        //static methods CANNOT use the keyword THIS
//        //Because static methods are used at the CLASS level
//        //where you do not have an object instance.
//        //THIS must be used with an object instance
//        //
//        return firstName.substring(0, 1);
//    }
//
////    public static void foo(){//void doesn't return anything
////
////
////
////    }
//
//    public static void main(String[] args) {
//
//        person.Person jett = new person.Person(); //new variable bob of type Person_00Lecture. Create a new object of the Class
//        jett.firstName = "Jett";
//        jett.lastName = "Fisher";
//
//        person.Person barbra = new person.Person();
//        barbra.firstName = "Barbra";
//        barbra.lastName = "Jackson";
//
//        System.out.println(jett.getFullName());
//        System.out.println(barbra.getFullName());
//
//       person.Person.abbreviateFirstName("Bob");
//
//       person.Person tom = new person.Person("tom", "jones");
//        System.out.println(tom.getFullName());


//        System.out.println(abbreviateFirstName());

//        person.Person.foo(); //correct way to use static method,


