package LeetCode.problems.easy;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i]) {
                nums[insertIndex++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return insertIndex;
    }


}
