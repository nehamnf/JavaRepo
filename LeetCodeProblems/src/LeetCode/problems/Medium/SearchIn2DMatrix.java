package LeetCode.problems.Medium;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(
            new int[][]{ {1,3,5,7},{10,11,16,20},{23,30,34,60}},34
        ));

        System.out.println(searchMatrix(
                new int[][]{{1,3}},3
        ));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        boolean found = false;
        while (i < matrix.length) {
            int j = 0;
            int end = matrix[i].length - 1;
            System.out.println("matrix[i][j]: "+matrix[i][j]+" matrix[i][end]: "+matrix[i][end]);
            if (target >= matrix[i][j] && target <= matrix[i][end]) {
                found = binarysearch(matrix[i], target);
                System.out.println(found);
                return found;
            }
            i++;
        }
        return found;
    }

    public static boolean binarysearch(int[] arr, int k) {
        // Code Here
        System.out.println(Arrays.toString(arr));
        int left=0,right=arr.length-1,mid;

        while(left <= right){
            mid=(left+right)/2;
            System.out.println(mid);
            System.out.println("--"+arr[mid]);
            System.out.println( k);
            if(arr[mid] == k){
                return true;
            }

            if(k > arr[mid]){
                left= mid+1;
            }else {
                right=mid-1;
            }
        }
        return false;
    }
}
