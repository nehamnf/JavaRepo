package problems.EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoPairSumZero {
    public static void main(String[] args) {
        System.out.println(getPairs(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(getPairs(new int[]{6, 1, 8, 0, 4, -9, -1, -10, -6, -5}));
    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        int sum=0;
        int j=0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while (left < right) {
            sum=arr[left] + arr[right];
            System.out.println("left: "+left+" right: "+right+" SUM: "+sum);
            if ( sum== 0){
                ArrayList<Integer> insideArray=new ArrayList<>();
                System.out.println("left array: "+arr[left]+" right array: "+arr[right]+" SUM: "+sum);
                insideArray.add(arr[left]);
                insideArray.add(arr[right]);
                al.add(insideArray);
//                if (!al.contains(insideArray)) {
//                    al.add(insideArray);
//                }
                left++;
                right--;
                // Avoid duplicates
                while (left < right && arr[left] == arr[left - 1]) left++;
                while (left < right && arr[right] == arr[right + 1]) right--;
            }else if (sum < 0){
                left++;
            }else{
                right--;
            }
        }

        return al;
    }
}
