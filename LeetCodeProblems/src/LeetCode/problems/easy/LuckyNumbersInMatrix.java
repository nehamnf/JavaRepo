package LeetCode.problems.easy;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInMatrix {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1,10,4,2},{9,3,8,7},{15,16,17,12}
        };

        System.out.println(luckyNumbers(arr));
    }

    public static  List<Integer>  luckyNumbers(int[][] matrix) {

        int N = matrix.length, M = matrix[0].length;
        int[] minRow= new int[N];
        int[] maxCol= new int[M];
        for (int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j] < min){
                    min= matrix[i][j];
                }
            }
            System.out.println(min);
            minRow[i]=min;
        }

        int l=0;
        for (int i=0;i<M;i++){
            int max=0;
            for(int j=0;j< N;j++){
                if(matrix[j][i] > max){
                    max= matrix[j][i];
                }
            }
            System.out.println("max: "+max);
            maxCol[l++]=max;
        }

        System.out.println(Arrays.toString(minRow));
        System.out.println(Arrays.toString(maxCol));

        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }

        return luckyNumbers;
    }
}
