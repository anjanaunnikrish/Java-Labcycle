package geometry;

public class Triangle implements Shape2D{
    private double base;
    private double breadth;
    private double height;

    public Triangle(double length,double breadth,double height){
        this.base =base;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return base+breadth+height;
    }

    @Override
    public double area() {
        double s = perimeter() /2 ;
        return Math.sqrt(s * (s-base)*(s-breadth)*(s-height));
    }
}