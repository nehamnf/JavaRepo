package LeetCode.problems.easy;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        };
        System.out.println(countNegatives(arr));
    }
    public  static int countNegatives(int[][] grid) {

        int N= grid.length;
        int row=0;
        int col= grid[0].length-1;
        int count=0;
        while (col >=0 && row <= N-1){
            if(grid[row][col] < 0){
                count =count + (N - row);
                col--;
            }else if (grid[row][col] >= 0){
                row++;
            }
        }
        return count;
    }

}
