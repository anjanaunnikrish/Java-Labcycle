package payment;

public class CreditCard extends PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid the " + amount + "using Credit card");
    }
}