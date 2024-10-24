package LeetCode.problems.Medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };
        rotate(arr);
    }
    public static void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        for (int j=0;j< matrix[0].length/2;j++){
            for (int i=0;i < matrix.length;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][(matrix.length-1)-j];
                matrix[i][(matrix.length-1)-j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void transposeMatrix(int matrix[][]){
        for(int i=0;i < matrix.length-1;i++){
            for (int j=i+1;j< matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println("transpose: "+ Arrays.deepToString(matrix));
    }
}
