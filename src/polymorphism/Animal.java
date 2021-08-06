package polymorphism;

public class Animal {//FINAL cannot subclass the class

    public final void breathe(int numSeconds){
        System.out.println("Just breathe");
    }
    public void makeNoise() {
        System.out.println("...");

    }

//    public void purr(){
//        System.out.println("I don't know how to purr!");
//    }
}
