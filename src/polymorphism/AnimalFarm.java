package polymorphism;

public class AnimalFarm {
    public static final int MAX_FARM_ANIMALS = 10;

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeNoise();

//        genericAnimal.purr();//purr in Animal class

        genericAnimal = new Goat();
        genericAnimal.makeNoise();

        Goat billy = new Goat();
        billy.makeLotsOfNoise(5);

        genericAnimal = new Cat();
        genericAnimal.makeNoise();

        Cat smelly = new Cat();
        smelly.purr();//purr specific to Cat

        genericAnimal = new Pig();
        genericAnimal.makeNoise();


//        Goat simone = new Goat();
//        simone.makeNoise();
//
//        Pig babe = new Pig();
//        babe.makeNoise();
//
//        Cat garfield = new Cat();
//        garfield.makeNoise();
    }
}
