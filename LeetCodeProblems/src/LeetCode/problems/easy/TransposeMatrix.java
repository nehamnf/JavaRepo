package LeetCode.problems.easy;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };

        System.out.println(Arrays.deepToString(transpose(arr)));
    }

    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col= matrix[0].length;

        int[][] matrix2= new int[col][row];

        for(int i=0;i< row;i++){
            for (int j=0;j< col;j++){
                matrix2[j][i]=matrix[i][j];
            }
        }
        return matrix2;
    }
}
