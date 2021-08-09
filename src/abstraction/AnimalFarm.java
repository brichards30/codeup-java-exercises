package abstraction;

public class AnimalFarm {

    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {
//        Animal animal;
//
//        Pig msPiggy = new Pig();
//        msPiggy.walk();
//        msPiggy.breathe(20);
//        msPiggy.makeSound();

//        animal = new Snake();
//        animal.walk();
//        animal.breathe(3);
//        animal.makeSound();
//
//        Snake mike = new Snake();
//        mike.walk();
//        mike.breathe(4);
//        mike.makeSound();
//        mike.injectVenom();

        Animal[] animals = new Animal[MAX_ANIMALS];
        animals[0] = new Pig("Ms. Piggy");
        animals[1] = new Snake("Mike");
        animals[2] = new Duck("Patty");
        animals[3] = new Pig("Wilbur");
        animals[4] = new Chicken("Cesare");

        //Pig tempPig = (Pig) animals[0];
        //tempPig.fly();// Pigs do not have the Flyable interface

//        for (int i = 0; i < animals.length; i++) {
//            System.out.printf("%s is a(n) %s and goes: ", animals[i].getAnimalName(), animals[i].getClass().getSimpleName());
//            animals[i].makeSound();
//
//            if(animals[i] instanceof Snake){
//                Snake tempSnake = (Snake) animals[i];
//                tempSnake.injectVenom();
//            }
//        }
        //make animals that can fly, fly
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof FlightCapable) {
                System.out.printf("I found a(n) %s that can fly: ", animals[i].getClass().getSimpleName());
                FlightCapable tempFlyer = (FlightCapable) animals[i];
                tempFlyer.fly();
                tempFlyer.glide();
            }

        }

    }
}
