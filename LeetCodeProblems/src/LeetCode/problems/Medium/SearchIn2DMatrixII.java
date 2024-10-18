package LeetCode.problems.Medium;

import java.util.Arrays;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        System.out.println(searchMatrix(
                new int[][]{{1,3}},3
        ));

        System.out.println(searchMatrixBetter(
                new int[][]{{1,3}},3
        ));
    }

    //better approach
    public static boolean searchMatrixBetter(int[][] matrix, int target) {

        int row=0;
        int col= matrix[row].length-1;

        while ( row < matrix.length && col >=0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        int col = matrix[i].length - 1;
        boolean found = false;
        while (i < matrix.length) {
            int j = 0;
            System.out.println("matrix[i][j]: "+matrix[i][j]+" matrix[i][end]: "+matrix[i][col]);
            if (target >= matrix[i][j] && target <= matrix[i][col]) {
                found = binarysearch(matrix[i], target);
                if(found) {
                    return found;
                }
            }
            i++;
        }
        return found;
    }

    public static boolean binarysearch(int[] arr, int k) {
        // Code Here
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println(mid);
            System.out.println("--" + arr[mid]);
            System.out.println(k);
            if (arr[mid] == k) {
                return true;
            }

            if (k > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
