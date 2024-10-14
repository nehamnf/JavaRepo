package LeetCode.problems.easy;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,1,1,3,3,3,2,2}));
    }

    //O(NLog)
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int countSoFar=1;
        int maxSoFar=1;
        int num=nums[0];
        for (int i=1;i < nums.length;i++){
            if(nums[i] == nums[i-1]){
                countSoFar= countSoFar+1;
            }else {
                countSoFar=1;
            }
            if (maxSoFar < countSoFar){
                maxSoFar = countSoFar;
                num=nums[i];
            }

            System.out.println("maxSoFar: "+maxSoFar);
            System.out.println("number: "+num);
        }
        return num;
    }

    //O(n)
    public int majorityElementBetter(int[] nums) {
        int res = 0, count = 0;

        for(int n: nums) {
            if(count == 0)
                res = n;
            count += (n == res? 1: -1);
        }
        return res;
    }
}
