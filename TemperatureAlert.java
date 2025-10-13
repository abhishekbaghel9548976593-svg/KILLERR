package endterm;
import java.util.function.Predicate;
public class TemperatureAlert {
	 public static void main(String[] args) {
	        double threshold = 37.5;
	        double currentTemperature = 38.7;

	        Predicate<Double> isAboveThreshold = temp -> temp > threshold;

	        if(isAboveThreshold.test(currentTemperature)) {
	            System.out.println("Alert");
	        } else {
	            System.out.println("Temperature is normal.");
	        }
	    }
	

}
