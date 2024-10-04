package problems.MediumLevel;

import java.util.Arrays;

public class PairWithGivenSum {
    public static void main(String[] args) {
    int arr[] = new int[]{1, 4, 6, 8, 10, 45};
        System.out.println(twoSum(arr,8));
    }

    public static boolean twoSum(int arr[], int target) {
        // code here

        int left=0;
        int right=arr.length-1;
        boolean isExist=false;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while (left < right) {

            if (arr[left] + arr[right] == target){
                System.out.println("left: "+left+" right: "+right);
                isExist=true;
                break;
            }

            if (arr[left] + arr[right] < target){
                left++;
            }

            if (arr[left] + arr[right] > target){
                right--;
            }


        }
        return isExist;
    }
}
