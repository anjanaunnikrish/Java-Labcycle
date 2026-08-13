import payment.*;
public class PaymentALl {
    public static void main(String[] args){
        PaymentMethod p = new CreditCard();
        p.pay(5000);
        p = new UPI();
        p.pay(6000);
    }
}