package abstraction;

public class Snake extends Animal {

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Hsssssss");
    }

    @Override
    public void walk() {
        System.out.println("Slithers around slowly");
    }

    public void injectVenom(){
        System.out.println("He bite me! Heading to the ER!");
    }


}
