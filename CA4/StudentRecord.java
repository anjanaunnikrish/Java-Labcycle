class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    int rollno;
    int marks;

    Student(String name, int age, int rollno, int marks){
        super(name,age);
        this.rollno = rollno;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rollno: " + rollno);
        System.out.println("Marks: " + marks);
    }
}

public class StudentRecord {
    public static void main(String[] args){
        Student obj = new Student("Joseph", 23, 32, 85);
        obj.display();
    }
}