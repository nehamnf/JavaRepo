package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countSort(new int[]{1,2,2,1,3,5})));
    }

    public static int[] countSort(int[] arr)
    {
        // code here
        int max=0;
        for(Integer i: arr){
            if (i > max){
                max=i;
            }
        }
        int[] count=new int[max+1];

        for (int j : arr) {
            count[j] = count[j] + 1;
        }

        for (int i=1;i< count.length;i++){
            count[i]=count[i]+count[i-1];
        }

        int[] output= new int[arr.length];

        for (int i=arr.length-1;i >= 0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--; // count[arr[i]]=count[arr[i]] -1;
        }

        return output;
    }
}
