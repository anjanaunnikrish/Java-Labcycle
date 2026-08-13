class Employee{
    protected final String companyName;
    protected double salary;

    Employee(String companyName,double salary){
        this.companyName = companyName;
        this.salary=salary;
    }
    double calculateBonus(){
        return 0.05 * salary;
    }
}
class Manager extends Employee{
    Manager(String companyName,double salary){
        super(companyName,salary);
    }

    @Override
    double calculateBonus() {
        return 0.1 * salary;
    }
}
class SeniorManager extends Employee{
    private final double retentionBonus = 5000;

    SeniorManager(String companyName,double salary){
        super(companyName,salary);
    }

    @Override
    double calculateBonus() {
        return (0.15 * salary)+retentionBonus;
    }
}
public class EmployeeBonusChain {
    public static void main(String[] args){
        SeniorManager s = new SeniorManager("ABC Limited",80000);
        System.out.println("Company: "+s.companyName);
        System.out.println("Salary: "+s.calculateBonus());
    }
}