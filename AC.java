package endterm;

public class AC implements SmartDevice {
	 @Override
	    public void turnon() {
	        System.out.println("AC is turned ON.");
	    }

	    @Override
	    public void turnoff() {
	        System.out.println("AC is turned OFF.");
	    }

}
