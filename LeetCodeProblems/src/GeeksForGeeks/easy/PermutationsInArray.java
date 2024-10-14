package GeeksForGeeks.easy;

import java.util.Arrays;

public class PermutationsInArray {
    public static void main(String[] args) {
        System.out.println(isPossible(10,new int[]{2,1,3},new int[]{6,8,9}));
    }

    public static boolean isPossible(int k, int[] arr1, int[] arr2) {
        boolean possible =true;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0,j=arr2.length-1;i < arr1.length;i++,j--){
            if (arr1[i]+arr2[j] < k){
                return false;
            }
        }
        return possible;
    }
}
