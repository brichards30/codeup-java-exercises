package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


//    private int length;
//    private int width;
//
//    public Rectangle(int userWidth, int userLength){
//        this.length = userLength;
//        this.width = userWidth;
//    }
//
//    public double getPerimeter(){
//        double perimeter = (2 * length) + (2 * width);
//        return perimeter;
//    }
//
//    public double getArea(){
//        double area = length * width;
//        return area;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
