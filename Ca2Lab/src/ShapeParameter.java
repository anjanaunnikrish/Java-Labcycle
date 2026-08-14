class Shapes{
    protected String name;

    Shapes(String name){
        this.name = name;
    }
    void describe(){
        System.out.println("Shape: "+name);
    }
}
class Circle extends Shapes{
    private double radius;

    Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    void describe() {
        super.describe();
        double area = Math.PI*radius*radius;
        System.out.println("Area: "+area);
    }
}
public class ShapeParameter {
    public static void main(String[] args){
        Circle c = new Circle("circle",5);
                c.describe();
    }
}