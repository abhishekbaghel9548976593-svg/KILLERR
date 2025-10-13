package endterm;

public class UsePay {
	public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment creditCard = new CreditCard();
        DigitalPayment wallet = new Wallet();

        upi.pay(500);
        creditCard.pay(1000);
        wallet.pay(200);
    }

}
