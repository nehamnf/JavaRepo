package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{90,70,60,10,20,30,40},7);
        selectionSort(new int[]{4 ,1 ,3 ,9 ,7},5);
    }

    static void selectionSort(int arr[], int n)
    {
        //code here
        int min=0;
        for (int i=0;i < n;i++){
            min=i;
            for (int j=i+1;j< n;j++){
                if (arr[j] < arr[min]){
                    min=j;
                    System.out.println(min +" a "+arr[j]+" m "+arr[min]);
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
