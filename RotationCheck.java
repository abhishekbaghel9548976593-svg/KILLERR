package hello;
import java.util.Scanner;
public class RotationCheck {
	    public static void main(String[] args) {
	        String s1 = "ABCD";
	        String s2 = "CDAB";

	        boolean result = isRotation(s1, s2);
	        System.out.println("Is rotation: " + result);
	    }

	    public static boolean isRotation(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        String combined = s1 + s1;
	        return combined.contains(s2);
	    }
	}
