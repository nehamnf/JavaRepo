package LeetCode.problems.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5},3));
    }

    public static int searchInsert(int[] nums, int target) {

        int left=0,right=nums.length-1,mid=0;

        while (left <= right){
            mid=(left+right)/2;
            if(target == nums[mid]){
                System.out.println("mid: "+mid);
            }

            if(target > nums[mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        return right+1;
    }
}
