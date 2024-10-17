package LeetCode.problems.Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
        productExceptSelf(new int[]{-1,-1,0,5,3,-8});
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        left[0]=1;
        int product=1;
        for (int i=1;i < nums.length;i++){
            product= product * nums[i-1];
            left[i]=product;
            System.out.println(product);
        }
        right[nums.length-1]=1;
        product=1;
        for (int i=nums.length-2;i >= 0;i--){
            product= product * nums[i+1];
            right[i]=product;
            System.out.println(product);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int i=0;i< nums.length;i++){
            nums[i]=left[i]*right[i];
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
