package hello;
import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] word = input.split(" ");
		
		StringBuilder reversed = new StringBuilder();
		
		 for (int i = word.length - 1; i >= 0; i--) {
	            reversed.append(word[i]);
	            if (i != 0) {
	                reversed.append(" ");
	            }
	        }
	        System.out.println(reversed.toString());
	       
		
		
		
		
	}
}