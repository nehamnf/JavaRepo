package LeetCode.problems.easy;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(7));
    }

    public static boolean checkPerfectNumber(int num) {

        int sum = 0;
        boolean isPerfect = false;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            isPerfect = true;
        }
        return isPerfect;
    }
}
