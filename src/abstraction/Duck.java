package abstraction;

public class Duck extends Animal{

    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack quack!");

    }
}
