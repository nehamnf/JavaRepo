package LeetCode.problems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n) {

        int up=0, bottom=n-1;
        int left=0,right= n-1;

        int[][] result= new int[n][n];
        int count=1;

        while ( up <= bottom && left <=right){

            for(int i=left;i <= right;i++){
                result[up][i]=count++;
            }

            up++;

            for(int j=up;j <= bottom;j++){
                result[j][right]=count++;
            }

            right--;

            System.out.println("Up :"+up+" Bottom :"+bottom);
            if(up <= bottom) {

                for (int i = right; i >= left; i--) {
                    result[bottom][i]=count++;
                }

                bottom--;
            }

            System.out.println("Left :"+left+" Right :"+right);
            if (left <= right) {
                for(int j=bottom;j >= up ;j--){
                    result[j][left]=count++;
                }
                left++;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
