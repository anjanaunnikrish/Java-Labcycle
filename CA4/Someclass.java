class Shape{
    protected String name;

    Shape(String name){
        this.name = name;
    }

    void describe(){
        System.out.println(name);
    }
}

class Circle extends Shape{
    double radius;

    Circle(String name, int radius){
        super(name);
        this.radius = radius;
    }

    void describe(){
        super.describe();
        System.out.println(Math.PI * radius * radius);
    }
}

public class Someclass{
    public static void main(String[] args){
        Circle obj = new Circle("Red", 23);
        obj.describe();
    }
}