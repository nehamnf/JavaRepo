package SortingAlgorithms;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] a= new int[]{10,5,1,2,8};
        quickSort(a,0,a.length-1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high){
            int q= partition(arr,low,high);
            quickSort(arr,low,q-1);
            quickSort(arr,q+1,high);
        }
        System.out.println(Arrays.toString(arr));
        // code here
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;
        int j=low;
        while(j < high){
            if(arr[j] <= pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        return  i+1;
    }

}
