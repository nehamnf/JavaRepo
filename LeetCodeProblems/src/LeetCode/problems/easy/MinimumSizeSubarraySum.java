package LeetCode.problems.easy;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int j=0;
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
            while (sum >= target) {
                minLength = Math.min(minLength, i - j + 1);
                System.out.println(minLength);
                sum -= nums[j++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0:minLength;
    }
}
