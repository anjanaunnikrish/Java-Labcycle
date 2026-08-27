class Vehicle{
    int regno;
    int dailyRate;

    public Vehicle(int regno, int dailyRate){
        this.regno = regno;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days){
        return this.dailyRate * days;
    }
}

class Car extends Vehicle{
    int numDoors;

    Car(int regno, int dailyRate, int numDoors){
        super(regno, dailyRate);
        this.numDoors = numDoors;
    }

    double computeRent(int days){
        return super.computeRent(days) + 200;
    }
}

public class Demo{
    public static void main(String[] args){
        Car car = new Car(101, 500,7);
        System.out.println("Rent = " + car.computeRent(3));
    }

}
