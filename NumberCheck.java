package hello;
	public class NumberCheck {
	    public static void main(String[] args) {
	        String[] inputs = {"123", "12.34", "abc"};

	        for (String input : inputs) {
	            System.out.println("Input: \"" + input + "\" → Is number: " + isNumber(input));
	        }
	    }

	    public static boolean isNumber(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}



