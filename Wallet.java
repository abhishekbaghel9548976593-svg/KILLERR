package endterm;

public class Wallet implements DigitalPayment {
	@Override
    public void pay(double amount) {
        System.out.println(amount);
    }

}
