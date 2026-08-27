class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("This is Animal Class");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return super.toString() + " (Dog)";
    }
}

public class AnimalSound {
    public static void main(String[] args) {

        Dog obj = new Dog("Bruno");

        obj.makeSound();

        System.out.println(obj.toString());
    }
}
