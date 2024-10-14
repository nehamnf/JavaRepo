package LeetCode.problems.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        removeElement(new int[]{0,1,2,2,3,0,4,2},2);

    }

    //O(NlogN)
    public static void removeElement(int[] nums, int val) {
        int k=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i] ==val){
                nums[i] = 101;
            }else {
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);


        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }

    //O(n)
    public static int removeElementBetter(int[] nums, int val){
        int k=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=val) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
