package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
            bubbleSort(new int[]{90,70,60,10,20,30,40},7);
        bubbleSort(new int[]{2,1,3,4,5},5);
    }

    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        System.out.println(Arrays.toString(arr));
        //code here
        int temp=0;
        int flag=0;
        for (int i=0;i< n-1;i++){
            flag=0;
            for (int j=0; j < n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    System.out.println("i: "+i+" arr[j] "+arr[j]+" arr[j+1] "+arr[j+1]);
                   flag=1;
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (flag == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
