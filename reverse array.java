package java_2;
import java.util.Arrays;
public class reverse {
	public static void main(String[] args) {
        int[]a={1, 2, 3, 4, 5};
        for (int i=0;i<a.length/2;i++) {
            int t=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=t;
        }
        System.out.println(Arrays.toString(a));
    }
}

