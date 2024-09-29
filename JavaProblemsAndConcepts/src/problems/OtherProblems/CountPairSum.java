package problems.OtherProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountPairSum {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{5, 3, 8, 7},new int[]{2, 3, 7, 5},10));
        sort012(new ArrayList<>(Arrays.asList(0,1,2,0,1)));
    }

    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int left=0,right=arr2.length-1,count=0;

        while (left < arr1.length && right >=0 ){
            if (arr1[left] + arr2[right] == x){
                System.out.println("left: "+left+" right: "+right);
                count=count+1;
                left++;
                right--;
            }else if (arr1[left] + arr2[right] < x){
                left++;
            }else if (arr1[left] + arr2[right] > x){
                right--;
            }

        }
        return count;
    }

    public static void sort012(ArrayList<Integer> arr) {
        // code here
        Collections.sort(arr);
        for(Integer x:arr){
            System.out.print(x+" ");
        }
    }
}
