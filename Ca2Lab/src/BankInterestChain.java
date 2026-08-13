class Account{
    protected final double MIN_BALANCE=1000.0;
    protected double balance;

    Account(double balance){
        this.balance = balance;
    }
    double calculateInterest(){
        return balance * 0.04;
    }
}
class SavingsAccount extends Account{
    SavingsAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}
class FixedDepositAccount extends SavingsAccount{
    FixedDepositAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interest = super.calculateInterest();
        return interest + 1000;
    }
}
public class BankInterestChain {
    public static void main(String[] args){
        FixedDepositAccount d = new FixedDepositAccount(50000);
        System.out.println("Minimum Balance: "+d.MIN_BALANCE);
        System.out.println("Balance: "+d.calculateInterest());
    }
}