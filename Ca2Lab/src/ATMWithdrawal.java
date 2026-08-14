import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class ATM {
    private double balance = 5000;

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Invalid");
        }
        balance = balance - amount;
        System.out.println("Transaction successfull");
        System.out.println("Remaining balance: " + balance);
    }
}
public class ATMWithdrawal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();

        try{
            System.out.println("enter the amount:");
            double amount = input.nextDouble();
            atm.withdraw(amount);
        }catch (InsufficientFundsException e) {
            System.out.println("Sorry: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            input.close();
        }
    }
}
