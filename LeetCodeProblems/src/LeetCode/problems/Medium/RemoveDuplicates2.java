package LeetCode.problems.Medium;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    public static int  removeDuplicates(int[] nums) {
        int insertIndex = 1;
        int count=1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i]) {
                nums[insertIndex++] = nums[i];
                count=1;
            }else if (nums[i-1] == nums[i] && count < 2){
                nums[insertIndex++]=nums[i];
                count= count+1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return insertIndex;
    }

    public int removeDuplicatesBetter(int[] nums) {
        int n=nums.length;
        int i=2;
        for(int j=2;j<n;j++)
        {
            if(nums[j]!=nums[i-2])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
