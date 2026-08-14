class Vehicle{
    protected String regNo;
    protected double dailyRate;

    Vehicle(String regNo,double dailyRate){
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }
    double computeRent(int days){
        return days*dailyRate;
    }
}
class Car extends Vehicle{
    protected int numDoors;
    Car(String regNo,double dailyRate,int numDoors){
        super(regNo,dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}
public class VehicleDetails {
    public static void main(String[] args){
        Car c = new Car("KRK2877",250,0);
        System.out.println("Rent: "+c.computeRent(4));
    }
}