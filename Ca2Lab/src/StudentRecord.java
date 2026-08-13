class Person{
    protected String name;
    protected int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    protected int rollNo;
    protected double marks;

    Student(String name,int age,int rollNo,double marks){
        super(name,age);
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void display(){
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Name: "+name);
        System.out.println("Age :"+age);
        System.out.println("Roll number: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}
public class StudentRecord {
    public static void main(String[] args){
        Student s = new Student("Anjana",22,115,100);
        s.display();
    }
}