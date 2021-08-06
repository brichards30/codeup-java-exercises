package polymorphism;

public class Goat extends Animal{

    public void makeLotsOfNoise (int numNoises){
        for (int i = 0; i < numNoises ; i++) {
           makeNoise();
        }
    }
    @Override
    public void makeNoise() {
        System.out.println(("***BLEAT***"));
    }

}
