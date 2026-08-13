class Shape{
    protected final String SHAPE_TYPE = "2D";

    double area(){
        return 0;
    }
}
class Polygon extends Shape{
    @Override
    double area() {
        return -1;
    }
}
class Rectangle extends Polygon{
    private double length;
    private double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length*breadth;

    }
}
public class ShapeAreaChain {
    public static void main(String[] args){
        Rectangle r = new Rectangle(10,5);
        System.out.println("Shape: "+r.SHAPE_TYPE);
        System.out.println("Area: "+r.area());
    }
}