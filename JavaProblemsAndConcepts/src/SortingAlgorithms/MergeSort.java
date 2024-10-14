package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {4,1,5,9,2,3,8};
        int n=a.length;

        //calling the function to sort the array
        mergeSort(a,0,n-1);

    }

    static void merge(int[] arr, int l, int mid, int r)
    {
        System.out.println("Merge arr[]" + Arrays.toString(arr) +" l: "+l+" mid: "+mid+" r: "+r);
        // Your code here
        int[] a1 = new int[mid-l+1];
        int[] a2 = new int[r-mid];

        System.out.println("a1 length: "+a1.length);
        System.out.println("a2 length: "+a2.length);

        for(int i=l; i<=mid; i++){
            a1[i-l] = arr[i];
        }

        System.out.println("a1 array: "+Arrays.toString(a1));
        for(int i=mid+1; i<=r; i++){
            a2[i-mid-1] = arr[i];
        }

        System.out.println("a2 array: "+Arrays.toString(a2));
        int i = 0,j = 0,k = l;

        //merging the elements of both the ranges.
        while(i<a1.length && j<a2.length) {
            if(a1[i]<=a2[j]) {
                arr[k++] = a1[i++];
            }
            else {
                arr[k++] = a2[j++];
            }
        }

        //checking if any of the elements are left.
        while(i<a1.length) arr[k++] = a1[i++];
        while(j<a2.length) arr[k++] = a2[j++];

        System.out.println("Final array: "+Arrays.toString(arr));
    }
    static void mergeSort(int arr[], int l, int r)
    {
        System.out.println("Merge sort : "+Arrays.toString(arr) +" l: "+l+" r: "+r);
        //code here
        if(l<r) {
            int mid = (l + r)/2;

            System.out.println("Mid: "+mid);
            mergeSort(arr,l,mid);

            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }

    }

}
