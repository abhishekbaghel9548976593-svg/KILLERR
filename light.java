package endterm;

public class light implements SmartDevice {
	@Override
    public void turnon() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnoff() {
        System.out.println("Light is turned OFF.");
    }

}
