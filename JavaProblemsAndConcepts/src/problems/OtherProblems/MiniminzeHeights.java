package problems.OtherProblems;

import java.util.Arrays;

public class MiniminzeHeights {
    public static void main(String[] args) {
        int[] arr= new int[]{1,5,8,10};
        System.out.println(getMinDiff(arr,2));
    }

    public static int getMinDiff(int[] arr, int K) {
        int n = arr.length;

        if (n == 1) return 0;

        Arrays.sort(arr);

        int newMax = arr[n - 1] - K; // Start by assuming we decrease the tallest
        System.out.println(newMax);
        int newMin = arr[0] + K; // Start by assuming we increase the shortest
        System.out.println(newMin);

        for (int i = 1; i < n-1; i++) {
            // Calculate possible new heights after the required operations
            int increased = arr[i] + K;
            int decreased = arr[i] - K;

            // Adjust newMin and newMax based on operations
            if (decreased >= 0) {
                newMin = Math.min(newMin, decreased);
            }
            newMax = Math.max(newMax, increased);
            System.out.println("newMin :"+newMin);
            System.out.println("newMax :"+newMax);
        }

        // The minimum possible difference
        return newMax - newMin;
    }
}
