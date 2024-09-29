package problems.OtherProblems;

import java.util.Arrays;

public class FindDistinctElements2DArr {
    public static void main(String[] args) {
        System.out.println(countCommonElements(new int[][]{ {12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35}, {14, 1, 14, 3, 11},
                {14, 5, 3, 2, 1}, {1, 18, 3, 21, 14} }));
        System.out.println(countCommonElements(new int[][]{
                { 2, 1, 4, 3},
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}
        }));

    }

    public static int countCommonElements(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("The matrix is empty or invalid.");
        }

        int N = matrix.length;
        int[] rowCount = new int[1000]; // Assuming matrix elements are in range 0 to 1000
        boolean[] seen = new boolean[1000]; // To track elements seen in the current row

        // Process each row
        for (int r = 0; r < N; r++) {
            Arrays.fill(seen, false); // Reset the seen array for the current row

            for (int c = 0; c < N; c++) {
                int value = matrix[r][c];
                if (!seen[value]) {
                    rowCount[value]++;
                    seen[value] = true;
//                    System.out.println(value);
                }
            }
        }

        // Count elements that are common to all rows
        int commonCount = 0;
        for (int i = 0; i < 1000; i++) {
            if (rowCount[i] == N) {
//                System.out.println("Common elements: "+i);
                commonCount++;
            }
        }

        return commonCount;
    }

    public static int distinct(int matrix[][], int N)
    {

        int[] rowCount = new int[1001]; // Assuming matrix elements are in range 0 to 1000
        boolean[] seen = new boolean[1001]; // To track elements seen in the current row

        // Process each row
        for (int r = 0; r < N; r++) {
            Arrays.fill(seen, false); // Reset the seen array for the current row

            for (int c = 0; c < N; c++) {
                int value = matrix[r][c];
                if (!seen[value]) {
                    rowCount[value]++;
                    seen[value] = true;
                }
            }
        }
        int commonCount = 0;
        for (int i = 0; i < 1001; i++) {
            if (rowCount[i] == N) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
