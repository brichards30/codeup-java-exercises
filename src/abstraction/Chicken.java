package abstraction;

public class Chicken extends Animal implements FlightCapable {

    public Chicken(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");

    }

    @Override
    public void fly() {
        System.out.println("Flies a lil bit.");
    }
}
