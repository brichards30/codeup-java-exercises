package polymorphism;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("MEOW!");
    }

    public void purr(){
        System.out.println("Purrrrrrr...");
    }
}
