package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(new int[]{4 ,1 ,3 ,9 ,7},5);
        insertionSort(new int[]{90,70,60,10,20,30,40},7);
        insertionSortBetter(new int[]{90,70,60,10,20,30,40},7);
    }

    public static void insertionSort(int arr[], int n)
    {
        //code here
        int k=0;
        int j=0;
        for (int i =1;i< n;i++ ){
            k=arr[i];
            for (j=i;j > 0;j--){
                if (k < arr[j-1]){
                    arr[j]=arr[j-1];
                }else {
                    break;
                }
            }
            arr[j]=k;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSortBetter(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
