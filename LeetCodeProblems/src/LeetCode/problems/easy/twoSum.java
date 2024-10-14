package LeetCode.problems.easy;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    //this implementation works only for sorted arrays
    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
        int[] output = new int[2];
        int j = 0;
        while (left < right) {
            sum = nums[left] + nums[right];
            System.out.println(sum);
            if (sum == target) {
                output[j++] = left;
                output[j++] = right;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return output;
    }
}
