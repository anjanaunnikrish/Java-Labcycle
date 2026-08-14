package hr;

public class hrTest {
    public static void main(String[] args){
        FullTimeEmployee e = new FullTimeEmployee(5000);
        System.out.println("Salary"+e.calculateSalary());
        System.out.println("Tax: "+e.calculateTax());
    }
}
