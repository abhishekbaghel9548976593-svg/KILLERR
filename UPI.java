package endterm;

public class UPI implements DigitalPayment {
	@Override
    public void pay(double amount) {
        System.out.println(amount);
    }

}
