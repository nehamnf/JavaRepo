package LeetCode.problems.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12}
        };
        spiralOrder(arr);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int rows=matrix.length;
        int cols= matrix[0].length;

        int up=0, bottom=rows-1;
        int left=0,right= cols-1;

        List<Integer> result= new ArrayList<>();


        while ( result.size() < (rows * cols)){

            for(int i=left;i <= right;i++){
                result.add(matrix[up][i]);
            }

            up++;

            for(int j=up;j <= bottom;j++){
                result.add(matrix[j][right]);
            }

            right--;

            System.out.println("Up :"+up+" Bottom :"+bottom);
            if(up <= bottom) {

                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }

                bottom--;
            }

            System.out.println("Left :"+left+" Right :"+right);
            if (left <= right) {
                for(int j=bottom;j >= up ;j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }

        System.out.println(result);
        return result;
    }
}
