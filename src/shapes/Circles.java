package shapes;

import util.Input
public class Circles {

    public static void main(String[] args) {
        Input input = new Input();

       double userRadius = input.getDouble();

       Circle circle = new Circle(userRadius);

        System.out.println("Area: " + circle.getArea());
    }
}
