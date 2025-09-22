package hello;
public class RightRotation {
    public static void main(String[] args) {
        String input = "abcde";
        int k = 1;

        String result = rightRotate(input, k);
        System.out.println("Rotated String: " + result);
    }

    public static String rightRotate(String s, int k) {
        if (s == null || s.isEmpty()) return s;

        int n = s.length();
        k = k % n; // Handle cases where k > n

        return s.substring(n - k) + s.substring(0, n - k);
    }
}
