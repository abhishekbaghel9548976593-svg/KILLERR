package endterm;

public class Main {
	public static void main(String[] args) {
		SmartDevice light = new light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnon();
        ac.turnoff();
        tv.turnon();
        
    }

}
