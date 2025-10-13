package endterm;

public class CreditCard implements DigitalPayment {
	 @Override
	    public void pay(double amount) {
	        System.out.println(amount);
	    }

}
