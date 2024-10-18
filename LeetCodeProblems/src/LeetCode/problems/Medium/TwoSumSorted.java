package LeetCode.problems.Medium;

import java.util.Arrays;

public class TwoSumSorted {

    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15},9);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left=0,right=numbers.length-1;
        int sum=0;
        while (left < right){
            sum=numbers[left]+numbers[right];
            if(sum == target){
                int[] output= new int[2];
                output[0]=left+1;
                output[right]=right+1;
                return output;
            }else if (sum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[2];
    }
}
