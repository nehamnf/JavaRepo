package GeeksForGeeks.hard;

import java.util.Arrays;

public class MergeSortedArrayWithoutSpace {
    public static void main(String[] args) {
        merge(13,3,new long[]{13,17,18,19,20,22,22,27,36,39,46,48,50},new long[]{4,12,45});
    }

    public static void merge(int n, int m, long arr1[], long arr2[]) {
        // code here
        int min=Math.min(m,n);
        int i=0;
        int j=0;
        int k=min-1;
        while ( i <= k && j == m){
            if( arr1[i] >= arr2[j]){
                long temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                k--;
                j++;
            }else if (arr1[i] < arr2[j]){
                i++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
