import geometry.*;

public class TestClass {
    public static void main(String[] args){
        Square s = new Square(5);
        Triangle t = new Triangle(3,4,5);

        System.out.println("Area: "+ s.area());
        System.out.println("Perimeter"+ s.perimeter());

        System.out.println("Area: "+ t.area());
        System.out.println("perimeter: "+ t.perimeter());
    }
}
