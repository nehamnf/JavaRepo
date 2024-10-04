package problems.EasyLevel;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(5));
    }
    public static boolean isPowerofTwo(long n) {

        // Your code here
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
