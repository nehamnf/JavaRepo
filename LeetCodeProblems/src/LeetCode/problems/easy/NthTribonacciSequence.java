package LeetCode.problems.easy;

public class NthTribonacciSequence {
    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }

    public int tribonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacciRecursive(n - 1) + tribonacciRecursive(n - 2) + tribonacciRecursive(n - 3);
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int a = 0, b = 1, c = 1, sum = 2;
        for (int i = 4; i <= n; i++) {
            a = b;
            b = c;
            c = sum;
            sum = a + b + c;
        }
        return sum;
    }
}
