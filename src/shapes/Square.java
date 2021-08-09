package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }


//
//    public Square(int side){
//        super(side,side);
//    }
//
//    @Override
//    public double getPerimeter() {
//        double side = super.getWidth();
//        return 4 * side;
//    }
//
//    @Override
//    public double getArea() {
//        double side = super.getLength();
//        return side * side;
//    }
}
