package popquiz;

public class Mallard extends Duck implements Quackable{

    private int flySpeed;

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public Mallard(String name, int age) {
        super(name, age);
        this.flySpeed = 20;
    }

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }

    public void getDetails(){
        System.out.printf("Name: %s" + " Age: %d" + " Fly Speed: %d", getName(), getAge(), getFlySpeed());
    }
}
//%d for integers
