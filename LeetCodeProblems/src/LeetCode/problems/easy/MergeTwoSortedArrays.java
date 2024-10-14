package LeetCode.problems.easy;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

//        merge(arr1, 3,arr2,3);
        mergeMyCode(arr1,3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for the last position in nums1 (including zeros)
        // Make a copy of the first m elements of nums1.
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        // Read pointers for nums1Copy and nums2 respectively.
        int p1 = 0;
        int p2 = 0;

        // Compare elements from nums1Copy and nums2 and write the smallest to nums1.
        for (int p = 0; p < m + n; p++) {
            // We also need to ensure that p1 and p2 aren't over the boundaries
            // of their respective arrays.
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }

    public static void mergeMyCode(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] num3= new int[nums1.length];

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
        for(int z=0;z < nums1.length;z++){
            nums1[z]=num3[z];
            System.out.println("1: "+nums1[z]+" z: "+num3[z]);
        }
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(nums1));
    }
}
