package LeetCode.problems.easy;

public class PeakElement {
    public static void main(String[] args) {
//        System.out.println(findPeakElement(new int[]{1}));
        System.out.println(findPeakElement(new int[]{1,4,5,7,1,2,4,5,6,7}));
        System.out.println(findPeakElementBetter(new int[]{1,2}));
    }
    public static int findPeakElement(int[] nums) {


        if (nums.length == 1) {
            return 0;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = (left + right) / 2;

            System.out.println("left: " + left + ", right: " + right + ", mid: " + mid);

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int findPeakElementBetter(int[] nums) {


        if (nums.length == 1) {
            return 0;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;

            System.out.println("left: " + left + ", right: " + right + ", mid: " + mid);

            if((( mid == 0) || (nums[mid] >= nums[mid-1])) &&(( mid == nums.length-1) || (nums[mid] >= nums[mid+1]))){
                return mid;
            }

            if (mid >0 && nums[mid-1] > nums[mid]) {
                right = mid -1;
            } else {
                left=mid+1;
            }
        }
        return -1;
    }
}
