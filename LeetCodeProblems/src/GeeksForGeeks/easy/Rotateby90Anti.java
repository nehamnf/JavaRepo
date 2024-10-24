package GeeksForGeeks.easy;

import java.util.Arrays;

public class Rotateby90Anti {
    public static void main(String[] args) {
//        int[][] arr= new int[][]{
//                {1,2,3},{4,5,6},{7,8,9}
//        };

        int[][] arr= new int[][]{
                {16,8},{11,6}
        };
        rotateby90(arr);
        transposeMatrix(arr);
    }

    static void rotateby90(int matrix[][]) {

        transposeMatrix(matrix);

        for (int i=0;i< matrix.length/2;i++){
            for (int j=0;j < matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-i][j];
                matrix[matrix.length-i-1][j]=temp;
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
        System.out.println("transpose: "+Arrays.deepToString(matrix));
    }
}
