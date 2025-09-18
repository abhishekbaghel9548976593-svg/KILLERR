package java_2;
import java.util.Arrays;
public class max_min_array {
	public static void main(String[] args) {
	int[] arr2 = {3, 5, 1, 8, -2};
	int max = arr2[0], min = arr2[0];
	for (int x : arr2) {
	    if (x > max) max = x;
	    if (x < min) min = x;
	}
	System.out.println("Max="+max);
	System.out.println(min);
}
}
	