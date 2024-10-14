package GeeksForGeeks.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};

        merge(arr1, 3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0,j=0,k=0;
        int[] num3= new int[m+n];

        while(i < m && j < n){
            if (nums1[i] < nums2[j]){
                num3[k++]=nums1[i];
                i++;
            }else if (nums1[i] > nums2[j]){
                num3[k++]=nums2[j];
                j++;
            }else {
                num3[k++]=nums1[i];
                num3[k++]=nums2[j];
                i++;j++;
            }
        }

        while (i < m){
            num3[k++]=nums1[i];
            i++;
        }

        while (j < n){
            num3[k++]=nums2[j];
            j++;
        }

        System.out.println(Arrays.toString(num3));
    }
}
