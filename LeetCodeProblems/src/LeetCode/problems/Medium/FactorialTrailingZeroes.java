package LeetCode.problems.Medium;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(1000));
    }

    public static int trailingZeroes(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res = res + (n / i);
        }
        return res;
    }
}
