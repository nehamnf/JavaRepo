package LeetCode.problems.easy;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }

    public static int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if ((a % i == 0) && (b % i == 0)) {
                count = count + 1;
            }
        }
        return count;
    }
}
